package sun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
/*import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;*/

@SpringBootApplication
@ServletComponentScan
//@EnableDiscoveryClient
//@RefreshScope   //开启配置更新功能
@EnableAsync
@MapperScan("sun.study.Mybatis.Dao")
public class ConsumerClientApplication {

    public static void main(String[] args) {

        SpringApplication.run(ConsumerClientApplication.class, args);
    }
}