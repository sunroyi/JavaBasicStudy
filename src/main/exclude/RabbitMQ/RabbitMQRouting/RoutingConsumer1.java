package sun.study.RabbitMQ.RabbitMQRouting;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@RabbitListener(queues = RoutingConfig.QueueName1)    // 监听这个队列
public class RoutingConsumer1 {

    @RabbitHandler
    public void receive(String context){

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String now = sdf.format(new Date());

        System.out.println("Consumer1 收到消息（" + now + "）：" + context);
    }
}
