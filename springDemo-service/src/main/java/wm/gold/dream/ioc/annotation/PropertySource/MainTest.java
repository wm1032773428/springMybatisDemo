package wm.gold.dream.ioc.annotation.PropertySource;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import wm.gold.dream.ioc.annotation.profile.DreamDataSource;
import wm.gold.dream.ioc.annotation.profile.StandaloneDataConfig;

/**
 * @Author: wangmeng
 * @Date: 2018/11/8 14:21
 * @Version 1.0
 */
public class MainTest {
    @Test
    public void TestIOC1() {
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(PropertySourceConfig.class);

        System.out.println(applicationContext.getBean("propertySourceDreamDataSource"));
    }
}
