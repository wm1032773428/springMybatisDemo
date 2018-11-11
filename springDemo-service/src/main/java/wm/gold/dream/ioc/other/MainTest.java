package wm.gold.dream.ioc.other;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("application-ioc-other.xml");
        //Lookup的使用
        System.out.println(context.getBean("commandManager", CommandManager.class).createCommand());//两个不一样
        System.out.println(context.getBean("commandManager", CommandManager.class).createCommand());
        //replaced-method
        System.out.println(context.getBean("myValueCalculator", MyValueCalculator.class).computeValue("代理"));
        //别名
        System.out.println(context.getBean("account"));
        System.out.println(context.getBean("account1"));
        System.out.println(context.getBean("account2"));
        System.out.println(context.getBean("account3"));
        System.out.println(context.getBean("account4"));
        //depends-on
        System.out.println(context.getBean("account15"));

        //短的生命周期bean注入长的生命周期
        System.out.println(context.getBean("userService",Account.class).getAddress());//两个不一样
        System.out.println(context.getBean("userService",Account.class).getAddress());

        //PropertyPlaceholderConfigurer属性文件读取
        System.out.println(context.getBean("dataSource1"));

        //FactoryBean
        System.out.println(context.getBean("myFactoryBean"));
    }
}
