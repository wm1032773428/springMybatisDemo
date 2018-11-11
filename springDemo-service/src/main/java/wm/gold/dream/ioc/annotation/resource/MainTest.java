package wm.gold.dream.ioc.annotation.resource;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import wm.gold.dream.ioc.annotation.qualifier.MovieConfiguration2;

/**
 * @Author: wangmeng
 * @Date: 2018/11/8 14:21
 * @Version 1.0
 */
public class MainTest {
    @Test
    public void TestIOC1() {
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(FamilyConfiguration.class);

        System.out.println(applicationContext.getBean("person2"));
    }
}
