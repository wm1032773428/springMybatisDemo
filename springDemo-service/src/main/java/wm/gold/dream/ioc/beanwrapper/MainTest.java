package wm.gold.dream.ioc.beanwrapper;

import org.junit.Test;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import wm.gold.dream.ioc.validator.Customer;
import wm.gold.dream.ioc.validator.CustomerValidator;
import wm.gold.dream.ioc.validator.Person;
import wm.gold.dream.ioc.validator.PersonValidator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @Author: wangmeng
 * @Date: 2018/11/8 14:21
 * @Version 1.0
 */
public class MainTest {
    @Test
    public void TestIOC1() {
        BeanWrapper company = new BeanWrapperImpl(new Company());
// setting the company name..
        company.setPropertyValue("name", "Some Company Inc.");
// ... can also be done like this:
        PropertyValue value = new PropertyValue("name", "Some Company Inc.");
        company.setPropertyValue(value);

// ok, let's create the director and tie it to the company:
        BeanWrapper jim = new BeanWrapperImpl(new Employee());
        jim.setPropertyValue("name", "Jim Stravinsky");
        company.setPropertyValue("managingDirector", jim.getWrappedInstance());

// retrieving the salary of the managingDirector through the company
        Float salary = (Float) company.getPropertyValue("managingDirector.salary");
    }

    @Test
    public void TestIOC2() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        CustomDateEditor editor = new CustomDateEditor(dateFormat, true);

        editor.setAsText("2017-06-24 00-00-00");
        Date date = (Date) editor.getValue();   //获取到字符串对应的date对象

        editor.setValue(new Date());
        String dateStr = editor.getAsText();    //获取到对应的字符串对象
        System.out.println(dateStr);
    }

    //自定义编辑器
    @Test
    public void TestIOC3() {
        BeanWrapperImpl store = new BeanWrapperImpl(new Store());
        store.registerCustomEditor(Car.class,new CustomCarEditor());
        store.setPropertyValue("car","汽车,宝马,200.00");
        System.out.println(store.getPropertyValue("car").toString());
    }
}
