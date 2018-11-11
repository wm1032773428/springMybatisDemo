package wm.gold.dream.ioc.beanextensionpoint.impl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Author: wangmeng
 * @Date: 2018/10/29 22:22
 * @Version 1.0
 */
public class BeanPostProcessorImpl2 implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Before------------"+beanName);
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("After------------"+beanName);
        return bean;
    }
}
