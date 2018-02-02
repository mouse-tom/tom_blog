package com.mouse.blog.dao;

import com.mouse.blog.model.Article;

import java.util.List;

public interface ArticleMapper {
    int deleteByPrimaryKey(Short articleId);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(Short articleId);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKeyWithBLOBs(Article record);

    int updateByPrimaryKey(Article record);

    List<Article> selectByArticleNameOrContent(String searchContent);
}