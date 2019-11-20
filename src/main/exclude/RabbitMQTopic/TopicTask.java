package sun.study.RabbitMQTopic;

import org.springframework.amqp.core.AmqpTemplate;
import sun.study.RabbitMQRouting.RoutingConfig;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TopicTask implements Runnable {

    private AmqpTemplate rabbitTemplate;

    public TopicTask(AmqpTemplate rabbitTemplate){
        this.rabbitTemplate = rabbitTemplate;
    }

    @Override
    public void run() {

        // 消息内容
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String context = Thread.currentThread().getName() + " - " + sdf.format(new Date());

        // 发送消息
        if (Integer.parseInt(Thread.currentThread().getName().replace("Thread", ""))%2 == 0)
            this.rabbitTemplate.convertAndSend(TopicConfig.Exchange,TopicConfig.TopicDirect1, context);
        else
            this.rabbitTemplate.convertAndSend(TopicConfig.Exchange,TopicConfig.TopicDirect2, context);
        System.out.println("发送消息：" + context);
    }
}
