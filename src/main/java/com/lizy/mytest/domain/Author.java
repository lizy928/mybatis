package com.lizy.mytest.domain;

import org.mockito.Mock;

import java.io.Serializable;
import java.util.List;

/**
 * @author lizy
 * @date 2021/7/23 9:53
 */
public class Author implements Serializable {

    protected int id;
    protected String name;
    protected String age;
    protected String email;
    protected String bio;
    protected Section favouriteSection;

    private List<Article> articles;

    private SexEnum sex;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Section getFavouriteSection() {
        return favouriteSection;
    }

    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }

    public void setFavouriteSection(Section favouriteSection) {
        this.favouriteSection = favouriteSection;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}