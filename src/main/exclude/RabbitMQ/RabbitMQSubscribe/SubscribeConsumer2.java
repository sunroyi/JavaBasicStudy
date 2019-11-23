package sun.study.RabbitMQ.RabbitMQSubscribe;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@RabbitListener(queues = SubscribeConfig.QueueName2)    // 监听这个队列
public class SubscribeConsumer2 {

    @RabbitHandler
    public void receive(String context){

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String now = sdf.format(new Date());

        System.out.println("Consumer2 收到消息（" + now + "）：" + context);
    }
}
