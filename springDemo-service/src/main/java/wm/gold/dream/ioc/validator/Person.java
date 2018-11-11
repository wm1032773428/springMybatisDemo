package wm.gold.dream.ioc.validator;

/**
 * @Author: wangmeng
 * @Date: 2018/10/31 17:13
 * @Version 1.0
 */
public class Person {
    private int age;

    private String name;

    public Person() {
    }

    public Person(String name, int age ) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
