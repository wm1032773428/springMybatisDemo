package wm.gold.dream.ioc.injection;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: wangmeng
 * @Date: 2018/11/8 14:21
 * @Version 1.0
 */
public class MainTest {
    @Test
    public void TestIOC1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-ioc-injection.xml");
        //注入properties属性
        System.out.println(context.getBean("account1"));
        //注入集合
        System.out.println(context.getBean("collectionsBean"));
        //集合合并parent属性的使用
        System.out.println(context.getBean("child1"));
        System.out.println(context.getBean("child2"));
        //收集容器中所有的bean注入map属性
        System.out.println(context.getBean("autowireByTypeAccountBean"));

        System.out.println(context.getBean("inheritsWithClass"));
    }
}
