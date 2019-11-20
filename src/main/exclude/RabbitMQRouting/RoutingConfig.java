package sun.study.RabbitMQRouting;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RoutingConfig {

    public static final String UserName = "guest";
    public static final String PassWord = "guest";
    public static final String VHost = "guest";
    public static final String Host = "localhost";
    public static final int Port = 5672;    // 注意这里不是默认网页的端口15672，而是5672

    public static final String Exchange = "RoutingExchange";

    public static final String QueueName1 = "RoutingQueue1";
    public static final String QueueName2 = "RoutingQueue2";

    public static final String Direct1 = "RoutingDirect1";
    public static final String Direct2 = "RoutingDirect2";

    // 创建队列1
    @Bean
    public Queue RoutingQueue1(){
        return new Queue(QueueName1, true);
    }

    // 创建队列2
    @Bean
    public Queue RoutingQueue2(){
        return new Queue(QueueName2, true);
    }

    // 创建交换机
    @Bean
    DirectExchange RoutingDirectExchange(){
        return new DirectExchange(Exchange);
    }

    // 将队列1绑定到Exchange交换机上，使用RoutingDirect1作为路由规则
    @Bean
    Binding bindingExchangeMessageRoutingDirect1(Queue RoutingQueue1, DirectExchange RoutingDirectExchange){
        return BindingBuilder.bind(RoutingQueue1).to(RoutingDirectExchange).with(Direct1);
    }

    // 将队列2绑定到Exchange交换机上，使用RoutingDirect2作为路由规则
    @Bean
    Binding bindingExchangeMessageRoutingDirect2(Queue RoutingQueue2, DirectExchange RoutingDirectExchange){
        return BindingBuilder.bind(RoutingQueue2).to(RoutingDirectExchange).with(Direct2);
    }
}
