package wm.gold.dream.ioc.validator;

import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.validation.Validator;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: wangmeng
 * @Date: 2018/10/31 17:12
 * @Version 1.0
 */
public class PersonValidator implements Validator {

    /**
     * This Validator validates *only* Person instances
     */
    public boolean supports(Class clazz) {
        return Person.class.equals(clazz);
    }

    public void validate(Object obj, Errors e) {
       // ValidationUtils.rejectIfEmpty(e, "name", "name.empty");
        Person p = (Person) obj;
        if (p.getAge() < 0) {
            e.rejectValue("age", "negativevalue");
        } else if (p.getAge() > 110) {
            e.rejectValue("age", "too.darn.old",new Object[]{p.getAge()},"dsfsdfs");
        }
    }

    public static void main(String[] args) {
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
}
