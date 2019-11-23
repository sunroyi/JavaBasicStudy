package sun.study.RabbitMQ.Order;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = DeadLetterConfig.REDIRECT_QUEUE)
public class RedirectQueueConsumer {

    @RabbitHandler
    public void fromDeadLetter(String orderId){
        System.out.println("订单" + orderId + "已进入死信消费记录");
    }
}
