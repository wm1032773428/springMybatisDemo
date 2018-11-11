package wm.gold.dream.ioc.beanwrapper;

/**
 * @Author: wangmeng
 * @Date: 2018/10/31 20:12
 * @Version 1.0
 */
public class Company {

    private String name;
    private Employee managingDirector;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getManagingDirector() {
        return this.managingDirector;
    }

    public void setManagingDirector(Employee managingDirector) {
        this.managingDirector = managingDirector;
    }
}