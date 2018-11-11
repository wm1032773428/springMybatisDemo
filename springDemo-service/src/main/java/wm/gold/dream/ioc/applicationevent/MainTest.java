package wm.gold.dream.ioc.applicationevent;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import wm.gold.dream.ioc.validator.Customer;
import wm.gold.dream.ioc.validator.CustomerValidator;
import wm.gold.dream.ioc.validator.Person;
import wm.gold.dream.ioc.validator.PersonValidator;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: wangmeng
 * @Date: 2018/11/8 14:21
 * @Version 1.0
 */
public class MainTest {
    @Test
    public void TestIOC1() {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Config.class);
        applicationContext.getBean("emailService",EmailService.class).sendEmail("ssssssss","ffffff");
    }


}
