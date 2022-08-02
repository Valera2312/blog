package com.valera.blog.my_blog.Models;

import javax.persistence.*;

@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    public Comment(String name, String eMail, String content, String date, Long articleId) {
        this.name = name;
        this.eMail = eMail;
        this.content = content;
        this.date = date;
        this.articleId = articleId;
    }

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "`e-mail`", nullable = false, length = 30)
    private String eMail;

    @Lob
    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "date", nullable = false, length = 30)
    private String date;

    @Column(name = "article_id", nullable = false)
    private Long articleId;

    public Comment() {

    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}