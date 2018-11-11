package wm.gold.dream.ioc.instantiation;

/**
 * @Author: wangmeng
 * @Date: 2018/10/29 15:00
 * @Version 1.0
 */
public class AccountStaticFactory {

    private static Account account = new Account();

    public static Account createInstance() {
        return account;
    }

    public static Account createInstance(Long id, String name, String sex, int age, Address address) {
        return new Account(id,name,sex,age,address);
    }

}
