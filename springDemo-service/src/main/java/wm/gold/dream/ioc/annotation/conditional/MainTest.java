package wm.gold.dream.ioc.annotation.conditional;

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
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(WiFiConfig.class);
        applicationContext.getBean(WiFi.class);
    }
}
