package wm.gold.dream.web.beans;


import org.hibernate.validator.constraints.NotEmpty;

import java.util.Date;

/**
 * @Author: wangmeng
 * @Date: 2018/11/3 22:46
 * @Version 1.0
 */
public class Account {

    @NotEmpty
    private String name;

    private Integer age;

    private Date birthday;

    public Account() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account(String name, Integer age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
