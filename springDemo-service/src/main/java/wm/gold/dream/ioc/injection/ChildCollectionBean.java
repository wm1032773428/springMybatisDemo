package wm.gold.dream.ioc.injection;

import java.util.Properties;

/**
 * @Author: wangmeng
 * @Date: 2018/10/29 17:30
 * @Version 1.0
 * 演示集合的合并注入(parent属性)
 */
public class ChildCollectionBean {
    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "ChildCollectionBean{" +
                "properties=" + properties +
                '}';
    }
}
