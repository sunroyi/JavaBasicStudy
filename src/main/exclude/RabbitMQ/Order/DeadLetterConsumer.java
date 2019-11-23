package sun.study.RabbitMQ.Order;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = DeadLetterConfig.DEAD_LETTER_QUEUE)
public class DeadLetterConsumer {

    @RabbitHandler
    public void testDeadLetterQueueAndThrowsException(@Payload String orderId) {
        System.out.println("订单" + orderId + "已进入死信消费队列并报出异常");
        int i = 1 / 0;
    }
}
