package wm.gold.dream.web;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import wm.gold.dream.web.beans.Account;

/**
 * @Author: wangmeng
 * @Date: 2018/11/4 0:57
 * @Version 1.0
 */
@Component
public class AccountConverter implements Converter<String, Account> {
    @Override
    public Account convert(String str) {
        Account emp = null;
        //字符串格式 name-age
        if (str != null && str.split("-").length == 3) {
            emp = new Account();
            String[] arr = str.split("-");
            emp.setName(arr[0]);
            emp.setAge(Integer.parseInt(arr[1]));
        }
        return emp;
    }
}
