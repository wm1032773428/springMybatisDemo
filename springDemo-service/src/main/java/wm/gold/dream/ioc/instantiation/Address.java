package wm.gold.dream.ioc.instantiation;

/**
 * @Author: wangmeng
 * @Date: 2018/11/8 14:13
 * @Version 1.0
 */
public class Address {

    private String familyAddress;

    private String companyAddress;

    public String getFamilyAddress() {
        return familyAddress;
    }

    public void setFamilyAddress(String familyAddress) {
        this.familyAddress = familyAddress;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }
}
