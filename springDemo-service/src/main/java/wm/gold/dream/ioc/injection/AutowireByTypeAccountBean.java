package wm.gold.dream.ioc.injection;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * @Author: wangmeng
 * @Date: 2018/10/29 18:13
 * @Version 1.0
 * 在byType下,演示Map的注入,搜集spring容器的合适类型注入map属性
 */
public class AutowireByTypeAccountBean {

    private Map<String,Account> map;

//    自动按照类型注入集合报错,官网只支持自动按照类型注入map
    private List<Account> list;

    private Set<Account> set;

    public Map<String, Account> getMap() {
        return map;
    }

    public void setMap(Map<String, Account> map) {
        this.map = map;
    }

//    public List<Account> getList() {
//        return list;
//    }
//
//    public void setList(List<Account> list) {
//        this.list = list;
//    }

//    public Set<Account> getSet() {
//        return set;
//    }
//
//    public void setSet(Set<Account> set) {
//        this.set = set;
//    }

    @Override
    public String toString() {
        return "AutowireByTypeAccountBean{" +
                "map=" + mapToString(map) +"\n"+
                ", list=" + collectionToString(list) +"\n"+
                ", set=" + collectionToString(set) +"\n"+
                '}';
    }

    public String collectionToString(Collection collection){
        if(collection==null){
            return "";
        }
        String result="";
        for(Object object:collection){
            result+=object+",";
        }
        return result;
    }

    public String mapToString(Map map){
        if(map==null){
            return "";
        }
        String result="";
        for(Object object:map.keySet()){
            result+=object+":"+map.get(object)+",";;
        }
        return result;
    }
}
