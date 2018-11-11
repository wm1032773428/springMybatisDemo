package wm.gold.dream.ioc.beanextensionpoint.impl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Author: wangmeng
 * @Date: 2018/10/29 22:21
 * @Version 1.0
 * 对象扩展器
 */
public class BeanPostProcessorImpl1 implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Before------------"+beanName);
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("After------------"+beanName);
        return bean;
    }
}
