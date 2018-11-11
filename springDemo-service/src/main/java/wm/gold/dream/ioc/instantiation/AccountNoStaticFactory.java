package wm.gold.dream.ioc.instantiation;

/**
 * @Author: wangmeng
 * @Date: 2018/10/29 14:53
 * @Version 1.0
 * Account单例工厂
 */
public class AccountNoStaticFactory {

    private static Account account=new Account();

    public  Account createInstance(){
        return account;
    }

    public  Account createInstance(Long id, String name, String sex, int age, Address address) {
        return new Account(id,name,sex,age,address);
    }

}
