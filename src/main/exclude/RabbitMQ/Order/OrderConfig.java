package sun.study.RabbitMQ.Order;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.boot.autoconfigure.amqp.SimpleRabbitListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderConfig {

    // 下单派单交换机
    public static final String ORDER_EXCHANGE = "OrderExchange";
    // 下单派单队列
    public static final String ORDER_CREATE_QUEUE = "OrderCreateQueue";
    // 补单队列
    public static final String ORDER_COMPENSATE_QUEUE = "OrderCompensateQueue";

    // 下单派单队列
    @Bean
    public Queue createQueue(){
        return new Queue(ORDER_CREATE_QUEUE);
    }

    // 补单队列
    @Bean
    public Queue compensateQueue(){
        return new Queue(ORDER_COMPENSATE_QUEUE);
    }

    // 下单派单交换机
    @Bean
    public DirectExchange orderExchange(){
        return new DirectExchange(ORDER_EXCHANGE);
    }

    // 下单派单队列绑定交换机
    @Bean
    Binding bindingExchangeCreateQueue(){
        return BindingBuilder.bind(createQueue()).to(orderExchange()).with("orderRoutingKey");
    }

    // 补单队列绑定交换机
    @Bean
    Binding bindingExchangeCompensateQueue(){
        return BindingBuilder.bind(compensateQueue()).to(orderExchange()).with("orderRoutingKey");
    }

}
