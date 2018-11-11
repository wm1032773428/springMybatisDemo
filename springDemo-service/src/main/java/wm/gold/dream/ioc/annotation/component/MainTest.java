package wm.gold.dream.ioc.annotation.component;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: wangmeng
 * @Date: 2018/11/8 14:21
 * @Version 1.0
 */
public class MainTest {
    @Test
    public void TestIOC1() {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Config.class);

        System.out.println(applicationContext.getBean("myThing"));
        System.out.println(applicationContext.getBean("dataSource1"));
        System.out.println(applicationContext.getBean("subsystemA-dataSource"));
        System.out.println(applicationContext.getBean("publicInstance"));
    }
}
