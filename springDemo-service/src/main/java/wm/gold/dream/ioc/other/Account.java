package wm.gold.dream.ioc.other;

/**
 * @Author: wangmeng
 * @Date: 2018/10/29 14:15
 * @Version 1.0
 */
public class Account {

    Address address;

    public Account() {
        System.out.println("------------Account-----------------");
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
