package com.mouse.blog.model;

public class Article {
    private Short articleId;

    private String articleName;

    private Integer articleTime;

    private String articleIp;

    private Integer articleClick;

    private Integer sortArticleId;

    private Integer userId;

    private Byte typeId;

    private Integer articleType;

    private Byte articleUp;

    private Byte articleSupport;

    private String articleContent;

    public Article(Short articleId, String articleName, Integer articleTime, String articleIp, Integer articleClick, Integer sortArticleId, Integer userId, Byte typeId, Integer articleType, Byte articleUp, Byte articleSupport, String articleContent) {
        this.articleId = articleId;
        this.articleName = articleName;
        this.articleTime = articleTime;
        this.articleIp = articleIp;
        this.articleClick = articleClick;
        this.sortArticleId = sortArticleId;
        this.userId = userId;
        this.typeId = typeId;
        this.articleType = articleType;
        this.articleUp = articleUp;
        this.articleSupport = articleSupport;
        this.articleContent = articleContent;
    }

    public Article() {
        super();
    }

    public Short getArticleId() {
        return articleId;
    }

    public void setArticleId(Short articleId) {
        this.articleId = articleId;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName == null ? null : articleName.trim();
    }

    public Integer getArticleTime() {
        return articleTime;
    }

    public void setArticleTime(Integer articleTime) {
        this.articleTime = articleTime;
    }

    public String getArticleIp() {
        return articleIp;
    }

    public void setArticleIp(String articleIp) {
        this.articleIp = articleIp == null ? null : articleIp.trim();
    }

    public Integer getArticleClick() {
        return articleClick;
    }

    public void setArticleClick(Integer articleClick) {
        this.articleClick = articleClick;
    }

    public Integer getSortArticleId() {
        return sortArticleId;
    }

    public void setSortArticleId(Integer sortArticleId) {
        this.sortArticleId = sortArticleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Byte getTypeId() {
        return typeId;
    }

    public void setTypeId(Byte typeId) {
        this.typeId = typeId;
    }

    public Integer getArticleType() {
        return articleType;
    }

    public void setArticleType(Integer articleType) {
        this.articleType = articleType;
    }

    public Byte getArticleUp() {
        return articleUp;
    }

    public void setArticleUp(Byte articleUp) {
        this.articleUp = articleUp;
    }

    public Byte getArticleSupport() {
        return articleSupport;
    }

    public void setArticleSupport(Byte articleSupport) {
        this.articleSupport = articleSupport;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent == null ? null : articleContent.trim();
    }
}