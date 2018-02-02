package com.mouse.blog.service;

import com.mouse.blog.model.Article;

import java.util.List;

/**
 * Created by Administrator on 2018/2/2.
 */
public interface ArticleService {

    /**
     *@Author yxs
     * @param searchContent
     * @return
     */
    List<Article> selectByArticleNameOrContent(String searchContent);

}
