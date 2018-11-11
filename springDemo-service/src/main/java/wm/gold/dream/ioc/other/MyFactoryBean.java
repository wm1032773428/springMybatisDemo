package wm.gold.dream.ioc.other;

import org.springframework.beans.factory.FactoryBean;

/**
 * @Author: wangmeng
 * @Date: 2018/10/29 23:11
 * @Version 1.0
 * 您可以org.springframework.beans.factory.FactoryBean为自己工厂的对象实现接口。
 *
 * 该FactoryBean接口是Spring IoC容器实例化逻辑的可插拔点。如果你有一个复杂的初始化代码，用Java表示，而不是（可能）冗长的XML，你可以创建自己的 FactoryBean，在该类中编写复杂的初始化，然后将自定义FactoryBean插入容器。
 *
 * 该FactoryBean接口提供了三种方法：
 *
 * Object getObject()：返回此工厂创建的对象的实例。实例可以共享，具体取决于此工厂是返回单例还是原型。
 *
 * boolean isSingleton()：true如果FactoryBean返回单例或false其他方式返回 。
 *
 * Class getObjectType()：返回getObject()方法返回的对象类型，或者null如果事先不知道类型。
 */
public class MyFactoryBean implements FactoryBean {
    public Object getObject() throws Exception {
        return new Account();
    }

    public Class<?> getObjectType() {
        return Account.class;
    }

    public boolean isSingleton() {
        return true;
    }
}
