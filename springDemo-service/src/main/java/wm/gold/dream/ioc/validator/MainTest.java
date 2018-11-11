package wm.gold.dream.ioc.validator;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import wm.gold.dream.ioc.other.Account;
import wm.gold.dream.ioc.other.CommandManager;
import wm.gold.dream.ioc.other.MyValueCalculator;

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
        Person person=new Person();
        person.setAge(200);
        PersonValidator validator = new PersonValidator();
        BindException errors = new BindException(person, "person");
        validator.validate(person,errors);

        List<ObjectError> allErrors = errors.getAllErrors();
        for (int i=0;i<allErrors.size();i++) {
            System.out.println(allErrors.get(i).getClass());
            System.out.println(allErrors.get(i).getCode());
            System.out.println(Arrays.toString(allErrors.get(i).getCodes()));
            System.out.println(allErrors.get(i).getObjectName());
            System.out.println(Arrays.toString(allErrors.get(i).getArguments()));
            System.out.println(allErrors.get(i).getDefaultMessage());

            System.out.println("---------------------------------");
        }
    }

    @Test
    public void TestIOC2() {
        Customer customer=new Customer();
        customer.setPerson(new Person());
        PersonValidator personValidator = new PersonValidator();
        CustomerValidator validator = new CustomerValidator(personValidator);
        BindException errors = new BindException(customer, "Customer");
        validator.validate(customer,errors);

        List<ObjectError> allErrors = errors.getAllErrors();
        for (int i=0;i<allErrors.size();i++) {
            System.out.println(allErrors.get(i).getClass());
            System.out.println(allErrors.get(i).getCode());
            System.out.println(Arrays.toString(allErrors.get(i).getCodes()));
            System.out.println(allErrors.get(i).getObjectName());
            System.out.println(Arrays.toString(allErrors.get(i).getArguments()));
            System.out.println(allErrors.get(i).getDefaultMessage());

            System.out.println("---------------------------------");
        }
    }
}
