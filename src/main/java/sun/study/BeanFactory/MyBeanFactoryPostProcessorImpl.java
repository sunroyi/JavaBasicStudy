package sun.study.BeanFactory;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessorImpl implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        BeanDefinition bd = configurableListableBeanFactory.getBeanDefinition("myBean");
        System.out.println("属性值:" + bd.getPropertyValues().toString());
        MutablePropertyValues propertyValues = bd.getPropertyValues();

        for(PropertyValue p:propertyValues.getPropertyValues()){
            System.out.println("属性" + p.getName() + ":" + p.getValue());
        }

        if (propertyValues.contains("mark"))
            propertyValues.addPropertyValue("mark", "initMark->afterMark");
    }
}
