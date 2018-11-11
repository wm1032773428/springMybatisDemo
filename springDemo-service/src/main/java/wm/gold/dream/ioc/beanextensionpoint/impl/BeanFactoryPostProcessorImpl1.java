package wm.gold.dream.ioc.beanextensionpoint.impl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @Author: wangmeng
 * @Date: 2018/10/29 22:38
 * @Version 1.0
 * 工厂扩展器(PropertyPlaceholderConfigurer,PropertyOverrideConfigurer)
 */
public class BeanFactoryPostProcessorImpl1 implements BeanFactoryPostProcessor {

    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("postProcessBeanFactory------------"+configurableListableBeanFactory);
    }
}
