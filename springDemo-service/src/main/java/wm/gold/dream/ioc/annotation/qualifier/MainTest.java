package wm.gold.dream.ioc.annotation.qualifier;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import wm.gold.dream.ioc.annotation.PropertySource.PropertySourceConfig;

/**
 * @Author: wangmeng
 * @Date: 2018/11/8 14:21
 * @Version 1.0
 */
public class MainTest {
    @Test
    public void TestIOC1() {
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(MovieConfiguration2.class);

        System.out.println(applicationContext.getBean("movieRecommender2"));
    }
}
