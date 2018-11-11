package wm.gold.dream.ioc.instantiation;

/**
 * @Author: wangmeng
 * @Date: 2018/11/8 14:12
 * @Version 1.0
 */
public class Account {
    //主键
    private Long id;
    //名字
    private String name;
    //性别
    private String sex;
    //年龄
    private int age;
    //地址
    private Address address;

    public Account(){

    }

    public Account(Long id, String name, String sex, int age, Address address) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
