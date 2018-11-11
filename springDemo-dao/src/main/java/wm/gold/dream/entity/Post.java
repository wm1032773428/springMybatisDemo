package wm.gold.dream.entity;

import java.util.List;

/**
 * @Author: wangmeng
 * @Date: 2018/11/5 22:23
 * @Version 1.0
 */
public class Post {
    private Long id;
    private String subject;
    private Author author;
    private List<Comment> commentList;
    private List<Tag> tags;
    private Integer draft;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public Integer getDraft() {
        return draft;
    }

    public void setDraft(Integer draft) {
        this.draft = draft;
    }
}
