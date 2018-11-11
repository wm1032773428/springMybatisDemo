package wm.gold.dream.ioc.validator;

import org.springframework.validation.*;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: wangmeng
 * @Date: 2018/10/31 17:48
 * @Version 1.0
 */
public class CustomerValidator implements Validator {

    private final Validator personValidator;

    public CustomerValidator(Validator addressValidator) {
        if (addressValidator == null) {
            throw new IllegalArgumentException("The supplied [Validator] is " +
                    "required and must not be null.");
        }
        if (!addressValidator.supports(Person.class)) {
            throw new IllegalArgumentException("The supplied [Validator] must " +
                    "support the validation of [Address] instances.");
        }
        this.personValidator = addressValidator;
    }

    /**
     * This Validator validates Customer instances, and any subclasses of Customer too
     */
    public boolean supports(Class clazz) {
        return Customer.class.isAssignableFrom(clazz);
    }

    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "firstName");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "surname", "surname");
        Customer customer = (Customer) target;
        try {
            errors.pushNestedPath("person");
            ValidationUtils.invokeValidator(this.personValidator, customer.getPerson(), errors);
        } finally {
            errors.popNestedPath();
        }



    }

    public static void main(String[] args) {
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
