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

     /*
      * @Description 通过 id 查询
      * @author 杨雪松
      * @date 2018/2/7 14:21
      * @param
      * @return
      */
    public Article selectById(String id);

     /*
      * @Description 新增文章
      * @author 杨雪松
      * @date 2018/2/7 14:31
      * @param
      * @return
      */
    public Integer publishArticle(Article article);

}
