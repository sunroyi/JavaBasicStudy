package sun.study.Proxy.MyTest;

public class UserProxyTest {

    public static void main(String[] args){
        UserProxy proxy = new UserProxy();

        UserServiceInterface us = proxy.newInstance(UserServiceInterface.class);
        User user = us.getUserById(10);
        System.out.println(user.getName());
    }
}
