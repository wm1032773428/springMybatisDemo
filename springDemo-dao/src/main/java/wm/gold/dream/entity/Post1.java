package wm.gold.dream.entity;

/**
 * @Author: wangmeng
 * @Date: 2018/11/6 10:52
 * @Version 1.0
 */
public class Post1 extends Post{

    private String subject;

    @Override
    public String getSubject() {
        return subject;
    }

    @Override
    public void setSubject(String subject) {
        this.subject = subject;
    }
}
