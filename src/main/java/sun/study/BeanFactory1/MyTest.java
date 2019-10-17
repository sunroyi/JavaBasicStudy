package sun.study.BeanFactory1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args){

        ApplicationContext ctx = new ClassPathXmlApplicationContext("sun/study/BeanFactory1/MyBean.xml");

        MyBean bean = (MyBean)ctx.getBean("MyBean");
        System.out.println(bean.getKey());
        System.out.println(bean.getValue());
    }
}
