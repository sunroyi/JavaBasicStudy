package sun.study.RabbitMQSimple;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SimpleConfig {

    public static final String UserName = "guest";
    public static final String PassWord = "guest";
    public static final String VHost = "guest";
    public static final String Host = "localhost";
    public static final int Port = 5672;    // 注意这里不是默认网页的端口15672，而是5672

    public static final String QueueName = "SimpleQueue";

    // 创建队列
    @Bean
    public Queue SimpleQueue(){
        return new Queue(QueueName);
    }

}
