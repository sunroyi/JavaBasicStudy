package sun.study.RabbitMQ.Order;

import com.alibaba.fastjson.JSONObject;
import com.rabbitmq.client.Channel;
import org.apache.commons.lang3.StringUtils;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.stereotype.Component;
import sun.study.RabbitMQ.RabbitMQRetry.RetryConfig;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Component
public class OrderConsumer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @RabbitListener(queues = OrderConfig.ORDER_CREATE_QUEUE)
    public void receiveFromCreateQueue(Message message, @Headers Map<String, Object> headers, Channel channel) throws Exception {
        String messageId = message.getMessageProperties().getMessageId();

        String msg = new String(message.getBody(), "UTF-8");
        System.out.println("派单服务平台" + msg + ", 消息ID：" + messageId);
        JSONObject jsonObject = JSONObject.parseObject(msg);
        String orderId = jsonObject.getString("orderId");
        if (StringUtils.isEmpty(orderId)) {
            // 日志记录
            return;
        }

        if (orderId.equals("2")) {
            System.out.println("订单" + orderId + "签收");
            // 手动签收消息，通知MQ服务器端删除该消息
            channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
        }else {
            System.out.println("订单" + orderId + "丢弃");
            // 丢弃该消息
            channel.basicNack(message.getMessageProperties().getDeliveryTag(), false, false);

            // 向死信队列投递消息
            rabbitTemplate.convertAndSend(
                    DeadLetterConfig.DEAD_LETTER_EXCHANGE,
                    DeadLetterConfig.DEAD_LETTER_TEST_ROUTING_KEY,
                    orderId);
            System.out.println("订单" + orderId + "投入死信交换机");
        }
    }
}
