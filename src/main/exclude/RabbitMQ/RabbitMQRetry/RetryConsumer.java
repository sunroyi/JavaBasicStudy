package sun.study.RabbitMQ.RabbitMQRetry;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@RabbitListener(queues = RetryConfig.QueueName, containerFactory = "customContainerFactory")    // 监听这个队列
public class RetryConsumer {

    @RabbitHandler
    public void receive(String context) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String now = sdf.format(new Date());

        System.out.println("Consumer 收到消息（" + now + "）：" + context);
        throw new RuntimeException("Retry");
    }
}
