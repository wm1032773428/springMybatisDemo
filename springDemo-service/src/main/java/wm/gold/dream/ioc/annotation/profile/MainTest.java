package wm.gold.dream.ioc.annotation.profile;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import wm.gold.dream.ioc.annotation.primary.MovieConfiguration;
import wm.gold.dream.ioc.annotation.primary.MovieRecommender;

/**
 * @Author: wangmeng
 * @Date: 2018/11/8 14:21
 * @Version 1.0
 */
public class MainTest {
    @Test
    public void TestIOC1() {
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext();
        applicationContext.getEnvironment().setActiveProfiles("development");
        applicationContext.register(StandaloneDataConfig.class);
        applicationContext.refresh();
        System.out.println(applicationContext.getBean(DreamDataSource.class));
    }
}
