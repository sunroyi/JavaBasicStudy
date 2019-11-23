package sun.study.RabbitMQ.Order;

import com.alibaba.fastjson.JSONObject;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.study.RabbitMQ.RabbitMQRetry.RetryConfig;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class OrderService implements RabbitTemplate.ConfirmCallback {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void addOrderAndDispatch(int orderId) {

        // 创建订单，插入DB
        System.out.println("订单" + orderId + "保存成功");

        // 发送订单号
        send(String.valueOf(orderId));
    }

    private void send(String orderId){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("orderId", orderId);
        String msg = jsonObject.toJSONString();
        System.out.println("msg：" + msg);
        // 封装消息
        Message message = MessageBuilder.withBody(msg.getBytes()).setContentType(MessageProperties.CONTENT_TYPE_JSON).setContentEncoding("UTF-8").setMessageId(orderId).build();
        // 构建回调返回的数据
        CorrelationData correlationData = new CorrelationData(orderId);
        // 发送消息
        this.rabbitTemplate.setMandatory(true);
        this.rabbitTemplate.setConfirmCallback(this);
        rabbitTemplate.convertAndSend(OrderConfig.ORDER_EXCHANGE, "orderRoutingKey", message, correlationData);
    }

    @Override
    public void confirm(CorrelationData correlationData, boolean b, String s) {
        String orderId = correlationData.getId();
        System.out.println("消息ID：" + orderId);
        if (b)
            System.out.println("消息发送成功");
        else{
            send(orderId);
            System.out.println("消息发送失败：" + s);
        }
    }
}
