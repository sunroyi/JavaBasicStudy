package sun.study.RabbitMQSubscribe;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SubscribeConfig {

    public static final String UserName = "guest";
    public static final String PassWord = "guest";
    public static final String VHost = "guest";
    public static final String Host = "localhost";
    public static final int Port = 5672;    // 注意这里不是默认网页的端口15672，而是5672

    public static final String Exchange = "SubscribeExchange";

    public static final String QueueName1 = "SubscribeQueue1";
    public static final String QueueName2 = "SubscribeQueue2";

    // 创建队列1
    @Bean
    public Queue SubScribeQueue1(){
        return new Queue(QueueName1, true);
    }

    // 创建队列2
    @Bean
    public Queue SubScribeQueue2(){
        return new Queue(QueueName2, true);
    }

    // 创建交换机
    @Bean
    FanoutExchange SubScribeFanoutExchange(){
        return new FanoutExchange(Exchange);
    }

    // 将队列1绑定到Exchange交换机上
    @Bean
    Binding bindingExchangeMessageSubScribeFanout1(Queue SubScribeQueue1, FanoutExchange SubScribeFanoutExchange){
        return BindingBuilder.bind(SubScribeQueue1).to(SubScribeFanoutExchange);
    }

    // 将队列2绑定到Exchange交换机上
    @Bean
    Binding bindingExchangeMessageSubScribeFanout2(Queue SubScribeQueue2, FanoutExchange SubScribeFanoutExchange){
        return BindingBuilder.bind(SubScribeQueue2).to(SubScribeFanoutExchange);
    }
}
