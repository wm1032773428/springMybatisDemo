package wm.gold.dream.entity;

/**
 * @Author: wangmeng
 * @Date: 2018/11/5 22:20
 * @Version 1.0
 * 作者
 */
public class Author {
    private Long id;
    private String username;
    private String password;
    private String email;

    public Author() {


    }

    public Author(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
