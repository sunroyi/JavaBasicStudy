package sun.study.RabbitMQ.RabbitMQRetry;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.boot.autoconfigure.amqp.SimpleRabbitListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RetryConfig {

    public static final String QueueName = "RetryQueue";

    // 创建队列
    @Bean
    public Queue RetryQueue(){
        return new Queue(QueueName);
    }

    // 监听器默认是单线程的，通过配置容器工厂，可以设置为多线程
    @Bean("customContainerFactory")
    public SimpleRabbitListenerContainerFactory containerFactory(SimpleRabbitListenerContainerFactoryConfigurer configurer, ConnectionFactory connectionFactory) {
        SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
        factory.setConcurrentConsumers(10);  //设置线程数
        factory.setMaxConcurrentConsumers(10); //最大线程数
        configurer.configure(factory, connectionFactory);
        return factory;
    }
}
