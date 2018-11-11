package wm.gold.dream.factory;

import org.apache.ibatis.reflection.factory.DefaultObjectFactory;

import java.util.Collection;
import java.util.List;
import java.util.Properties;

/**
 * @Author: wangmeng
 * @Date: 2018/11/5 19:37
 * @Version 1.0
 */
public class MyObjectFactory extends DefaultObjectFactory {

    public Object create(Class type) {
        return super.create(type);
    }

    public <T> T create(Class<T> type, List<Class<?>> constructorArgTypes, List<Object> constructorArgs) {
        return super.create(type,constructorArgTypes,constructorArgs);
    }

    public void setProperties(Properties properties) {
        System.out.println(properties.getProperty("someProperty"));
        super.setProperties(properties);
    }
    public <T> boolean isCollection(Class<T> type) {
        return Collection.class.isAssignableFrom(type);
    }
}
