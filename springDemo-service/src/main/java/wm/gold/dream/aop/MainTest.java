package wm.gold.dream.aop;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import wm.gold.dream.aop.service.servicechild.ParamObject;
import wm.gold.dream.aop.service.servicechild.Service1;
import wm.gold.dream.ioc.annotation.resource.FamilyConfiguration;

/**
 * @Author: wangmeng
 * @Date: 2018/11/8 14:21
 * @Version 1.0
 */
public class MainTest {
    @Test
    public void TestIOC1() {
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(Config.class);
        Service1 service1=applicationContext.getBean(Service1.class);
        //service1.testAop1(new ParamObject());

        //service1.testReturnVal(new ParamObject());

        //service1.testThrowingVal();

        service1.testFan("ssss");
        service1.testFan(123);
        UsageTracked usageTracked=(UsageTracked)service1;
        usageTracked.testYinjie();
    }
}
