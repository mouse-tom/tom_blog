package com.mouse.blog.service.impl;

import com.mouse.blog.dao.ArticleMapper;
import com.mouse.blog.model.Article;
import com.mouse.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2018/2/2.
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;


       /*
        * @Description 文章列表查询
        * @author 杨雪松
        * @date 2018/2/2 18:09
        * @param
        * @return
        */
    @Override
    public List<Article> selectByArticleNameOrContent(String searchContent) {
        return articleMapper.selectByArticleNameOrContent(searchContent);
    }

     /*
      * @Description 通过 id 查询文章详情
      * @author 杨雪松
      * @date 2018/2/7 14:23
      * @param
      * @return
      */
    @Override
    public Article selectById(String id) {
        return articleMapper.selectByPrimaryKey(id);
    }

     /*
      * @Description 发表文章
      * @author 杨雪松
      * @date 2018/2/7 14:32
      * @param
      * @return
      */
     @Transactional
     @Override
    public Integer publishArticle(Article article) {
        return articleMapper.insert(article);
    }


}
