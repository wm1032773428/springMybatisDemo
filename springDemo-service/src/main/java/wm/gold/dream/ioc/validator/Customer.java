package wm.gold.dream.ioc.validator;

/**
 * @Author: wangmeng
 * @Date: 2018/10/31 17:48
 * @Version 1.0
 */
public class Customer {

    private String firstName;
    private String surname;

    private Person person;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
