package sun.study.RabbitMQ.RabbitMQWork;

import org.springframework.amqp.core.AmqpTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class WorkTask implements Runnable {

    private AmqpTemplate rabbitTemplate;

    public WorkTask(AmqpTemplate rabbitTemplate){
        this.rabbitTemplate = rabbitTemplate;
    }

    @Override
    public void run() {

        // 消息内容
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String context = Thread.currentThread().getName() + " - " + sdf.format(new Date());

        // 发送消息
        this.rabbitTemplate.convertAndSend(WorkConfig.QueueName, context);
        System.out.println("发送消息：" + context);
    }
}
