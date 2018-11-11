package wm.gold.dream.ioc.annotation.import1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import wm.gold.dream.ioc.annotation.component.Config;

/**
 * @Author: wangmeng
 * @Date: 2018/11/8 14:21
 * @Version 1.0
 */
public class MainTest {
    @Test
    public void TestIOC1() {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(ServiceConfig.class);

        System.out.println(applicationContext.getBean("accountRepository"));
    }
}
