package wm.gold.dream.ioc.annotation.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Set;

/**
 * @Author: wangmeng
 * @Date: 2018/10/30 14:22
 * @Version 1.0
 * @Autowired修饰集合
 */
@Component
public class CollectionPerson {
    @Autowired(required = false)
    private Company[] companies1;
    @Autowired(required = false)
    private Set<Company> companies2;
    @Autowired(required = false)
    private Map<String, Company> companyMap;

    @Autowired
    private ApplicationContext context;

    public ApplicationContext getContext() {
        return context;
    }

    public void setContext(ApplicationContext context) {
        this.context = context;
    }

    public Company[] getCompanies1() {
        return companies1;
    }

    public void setCompanies1(Company[] companies1) {
        this.companies1 = companies1;
    }

    public Set<Company> getCompanies2() {
        return companies2;
    }

    public void setCompanies2(Set<Company> companies2) {
        this.companies2 = companies2;
    }

    public Map<String, Company> getCompanyMap() {
        return companyMap;
    }

    @Autowired(required = false)
    public void setCompanyMap(Map<String, Company> companyMap) {
        this.companyMap = companyMap;
    }
}
