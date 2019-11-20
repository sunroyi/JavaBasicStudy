package sun.study.RabbitMQTopic;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TopicConfig {

    public static final String UserName = "guest";
    public static final String PassWord = "guest";
    public static final String VHost = "guest";
    public static final String Host = "localhost";
    public static final int Port = 5672;    // 注意这里不是默认网页的端口15672，而是5672

    public static final String Exchange = "TopicExchange";

    public static final String QueueName1 = "TopicQueue1";
    public static final String QueueName2 = "TopicQueue2";

    public static final String TopicDirect = "TopicDirect.#";
    public static final String TopicDirect1 = "TopicDirect.1.key";
    public static final String TopicDirect2 = "TopicDirect.2.key";

    // 创建队列1
    @Bean
    public Queue TopicQueue1(){
        return new Queue(QueueName1, true);
    }

    // 创建队列2
    @Bean
    public Queue TopicQueue2(){
        return new Queue(QueueName2, true);
    }

    // 创建交换机
    @Bean
    TopicExchange TopicDirectExchange(){
        return new TopicExchange(Exchange);
    }

    // 将队列1绑定到Exchange交换机上，使用TopicDirect作为路由规则
    @Bean
    Binding bindingExchangeMessageTopicDirect1(Queue TopicQueue1, TopicExchange TopicDirectExchange){
        return BindingBuilder.bind(TopicQueue1).to(TopicDirectExchange).with(TopicDirect);
    }

    // 将队列2绑定到Exchange交换机上，使用TopicDirect2作为路由规则
    @Bean
    Binding bindingExchangeMessageTopicDirect2(Queue TopicQueue2, TopicExchange TopicDirectExchange){
        return BindingBuilder.bind(TopicQueue2).to(TopicDirectExchange).with(TopicDirect2);
    }
}
