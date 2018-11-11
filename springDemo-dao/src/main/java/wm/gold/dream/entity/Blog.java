package wm.gold.dream.entity;

import com.gold.dream.bean.Color;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @Author: wangmeng
 * @Date: 2018/11/5 15:17
 * @Version 1.0
 */
public class Blog implements Serializable {

    private Long id;
    private Color enumIndex;
    private Color enumName;
    private Color enumValue;
    private String name;
    private Date createDate;
    private Author author;

    private List<Post> postList;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Color getEnumIndex() {
        return enumIndex;
    }

    public void setEnumIndex(Color enumIndex) {
        this.enumIndex = enumIndex;
    }

    public Color getEnumName() {
        return enumName;
    }

    public void setEnumName(Color enumName) {
        this.enumName = enumName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getEnumValue() {
        return enumValue;
    }

    public void setEnumValue(Color enumValue) {
        this.enumValue = enumValue;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<Post> getPostList() {
        return postList;
    }

    public void setPostList(List<Post> postList) {
        this.postList = postList;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", enumIndex=" + enumIndex +
                ", enumName=" + enumName +
                ", enumValue=" + enumValue +
                ", name='" + name + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
