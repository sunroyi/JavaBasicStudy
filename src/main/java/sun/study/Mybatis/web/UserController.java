package sun.study.Mybatis.web;

import common.entity.RestfulResult;
import common.utils.CommUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sun.study.Mybatis.Entity.User;
import sun.study.Mybatis.Service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("mybatis/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value="findList", method=RequestMethod.POST)
    public void findList(HttpServletRequest request, HttpServletResponse response,
                     @RequestBody User user) {

        RestfulResult restfulResult = new RestfulResult();

        try {
            List<User> userList = userService.findList(user);
            restfulResult.setData(userList);
        }catch (Exception ex){
            restfulResult.setMessage(ex.getMessage());
        }

        CommUtils.printDataJason(response, restfulResult);
    }

    @RequestMapping(value="get", method=RequestMethod.POST)
    public void get(HttpServletRequest request, HttpServletResponse response,
                         @RequestBody User user) {

        RestfulResult restfulResult = new RestfulResult();

        User result = userService.get(user);

        restfulResult.setData(result);

        CommUtils.printDataJason(response, restfulResult);
    }

    @RequestMapping(value="insert", method=RequestMethod.POST)
    public void insert(HttpServletRequest request, HttpServletResponse response,
                    @RequestBody User user) {

        RestfulResult restfulResult = new RestfulResult();

        userService.insert(user);

        CommUtils.printDataJason(response, restfulResult);
    }

    @RequestMapping(value="update", method=RequestMethod.POST)
    public void update(HttpServletRequest request, HttpServletResponse response,
                       @RequestBody User user) {

        RestfulResult restfulResult = new RestfulResult();

        userService.update(user);

        CommUtils.printDataJason(response, restfulResult);
    }

    @RequestMapping(value="delete", method=RequestMethod.POST)
    public void delete(HttpServletRequest request, HttpServletResponse response,
                       @RequestBody User user) {

        RestfulResult restfulResult = new RestfulResult();

        userService.delete(user);

        CommUtils.printDataJason(response, restfulResult);
    }
}
