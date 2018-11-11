package wm.gold.dream.ioc.beanextensionpoint;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import wm.gold.dream.ioc.beanextensionpoint.impl.BeanFactoryPostProcessorImpl1;
import wm.gold.dream.ioc.beanextensionpoint.impl.BeanPostProcessorImpl1;
import wm.gold.dream.ioc.beanextensionpoint.impl.BeanPostProcessorImpl2;

/**
 * @Author: wangmeng
 * @Date: 2018/10/29 22:19
 * @Version 1.0
 * 以编程方式注册BeanPostProcessor实例
 */
public class BeanPostProcessorProgramming implements ApplicationContextAware {

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext=(ClassPathXmlApplicationContext)applicationContext;
        classPathXmlApplicationContext.getBeanFactory().addBeanPostProcessor(new BeanPostProcessorImpl1());
        classPathXmlApplicationContext.getBeanFactory().addBeanPostProcessor(new BeanPostProcessorImpl2());

        ((ClassPathXmlApplicationContext) applicationContext).addBeanFactoryPostProcessor(new BeanFactoryPostProcessorImpl1());
    }


}
