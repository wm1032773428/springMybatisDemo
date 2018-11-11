package wm.gold.dream.ioc.injection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @Author: wangmeng
 * @Date: 2018/10/29 17:20
 * @Version 1.0
 * 演示集合xml的注入
 */
public class CollectionsBean {
    private Properties properties;
    private Map map;
    private List list;
    private Set set;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    @Override
    public String toString() {
        return "CollectionsBean{" +
                "properties=" + properties +
                ", map=" + map +
                ", list=" + list +
                ", set=" + set +
                '}';
    }
}
