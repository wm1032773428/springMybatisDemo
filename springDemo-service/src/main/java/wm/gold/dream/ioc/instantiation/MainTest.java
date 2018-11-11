package wm.gold.dream.ioc.instantiation;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("application-ioc-instantiation.xml");
        //实例工厂方法进行实例化
        System.out.println(context.getBean("account1"));
        System.out.println(context.getBean("account2"));
        //静态工厂方法实例化
        System.out.println(context.getBean("account3"));
        System.out.println(context.getBean("account4"));
        //基于构造函数的依赖注入
        System.out.println(context.getBean("account5"));
        System.out.println(context.getBean("account6"));
        //c命名空间进行更简洁的XML配置,及时发现拼写错误。强烈建议使用此类IDE帮助。
        System.out.println(context.getBean("account7"));
        System.out.println(context.getBean("account8"));
        //基于Setter的依赖注入，能够防止循环依赖
        System.out.println(context.getBean("account9"));
        //带有p命名空间的XML快捷方式
        System.out.println(context.getBean("account10"));
    }
}
