package sun.study.RabbitMQSimple;

import common.entity.RestfulResult;
import common.utils.CommUtils;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class SimplePublisher {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @RequestMapping("SimplePublisher/send")
    public void send(HttpServletRequest request, HttpServletResponse response) {

        RestfulResult restfulResult = new RestfulResult();

        for(int i=0;i<10;i++){
            Thread thread = new Thread(new SimpleTask(rabbitTemplate));
            thread.setName("Thread" + i);
            thread.start();
        }

        restfulResult.setData("Success");

        CommUtils.printDataJason(response, restfulResult);
    }

}
