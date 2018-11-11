package wm.gold.dream.ioc.annotation.component;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;

/**
 * @Author: wangmeng
 * @Date: 2018/10/30 16:19
 * @Version 1.0
 */
public class MyNameGenerator implements BeanNameGenerator {

    public String generateBeanName(BeanDefinition beanDefinition, BeanDefinitionRegistry beanDefinitionRegistry) {
        return beanDefinition.getBeanClassName();
    }

}
