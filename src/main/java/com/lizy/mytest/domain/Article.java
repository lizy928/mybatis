package com.lizy.mytest.domain;

import java.util.Date;

/**
 * @author lizy
 * @date 2021/7/23 9:47
 */
public class Article {

    private Integer id;
    private String title;
    private Author author;
    private String content;
    private Date createTime;
    private ArticleTypeEnum type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public ArticleTypeEnum getType() {
        return type;
    }

    public void setType(ArticleTypeEnum type) {
        this.type = type;
    }
}