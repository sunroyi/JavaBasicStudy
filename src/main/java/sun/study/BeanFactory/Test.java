package sun.study.BeanFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("sun/study/BeanFactory/Bean.xml");

        MyBean bean = (MyBean)context.getBean("myBean");

        System.out.println("描述：" + bean.getDesc());
        System.out.println("备注：" + bean.getMark());
    }
}
