package wm.gold.dream.web.Validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import wm.gold.dream.web.beans.Account;

/**
 * @Author: wangmeng
 * @Date: 2018/11/4 12:02
 * @Version 1.0
 */
public class AccountValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Account.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Account p = (Account) o;
        if (p.getAge() < 0) {
            errors.rejectValue("age", "negative value");
        } else if (p.getAge() > 110) {
            errors.rejectValue("age", "too.darn.old");
        }
    }
}
