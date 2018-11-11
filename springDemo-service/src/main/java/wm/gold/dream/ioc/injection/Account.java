package wm.gold.dream.ioc.injection;

import wm.gold.dream.ioc.injection.Address;

import java.util.Properties;

/**
 * @Author: wangmeng
 * @Date: 2018/11/8 14:12
 * @Version 1.0
 */
public class Account {

    private String name;
    private Integer  age;
    Properties properties;
    //地址
    private Address address;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", properties=" + properties +
                ", address=" + address +
                '}';
    }
}
