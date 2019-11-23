package sun.study.RabbitMQ.Order;

import common.entity.RestfulResult;
import common.utils.CommUtils;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class OrderPublisher {

    @Autowired
    private OrderService orderService;

    @RequestMapping("Order/send")
    public void send(HttpServletRequest request, HttpServletResponse response) {

        RestfulResult restfulResult = new RestfulResult();

        for(int i=1;i<3;i++){
            orderService.addOrderAndDispatch(i);
        }

        restfulResult.setData("Success");

        CommUtils.printDataJason(response, restfulResult);
    }

}
