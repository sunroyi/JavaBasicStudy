/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package sun.controller;

import common.entity.RestfulResult;
import common.utils.CommUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sun.entity.ServiceInfo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "service")
public class ServiceController {

    int i=0;

    @RequestMapping(value = "hello")
    public void login(HttpServletRequest request, HttpServletResponse response,
                      @RequestBody ServiceInfo serviceInfo) {

        RestfulResult restfulResult = new RestfulResult();

        try {
            restfulResult.setData("Welcome " + serviceInfo.getName() + "!++");

        } catch (Exception e) {
            e.printStackTrace();
        }

        CommUtils.printDataJason(response, restfulResult);
    }

    @RequestMapping(value = "test")
    public void test(HttpServletRequest request, HttpServletResponse response) {

        RestfulResult restfulResult = new RestfulResult();

        try {
            i = i+15;

            restfulResult.setData(i);

        } catch (Exception e) {
            e.printStackTrace();
        }

        CommUtils.printDataJason(response, restfulResult);
    }

    @RequestMapping(value = "sleep")
    public void sleep(HttpServletRequest request, HttpServletResponse response,
                      @RequestParam(value="param") String param) {

        RestfulResult restfulResult = new RestfulResult();

        try {
            if (param.equals("sleep")) {
                Thread.sleep(5000);
                System.out.println("sleep end");
            }
            else
                System.out.println("test");

            restfulResult.setData("Success");

        } catch (Exception e) {
            e.printStackTrace();
        }

        CommUtils.printDataJason(response, restfulResult);
    }
}