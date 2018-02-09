package com.mouse.blog.controller;

import com.mouse.blog.model.Article;
import com.mouse.blog.service.ArticleService;
import com.mouse.blog.utils.JSONUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 杨雪松
 * @Description 文章管理
 * @create 2018-02-02 18:15
 **/
@Controller
@RequestMapping(value="article")
public class ArticleController {

    private static Logger log = Logger.getLogger(ArticleController.class);

    @Autowired
    private ArticleService articleService;


     /*
      * @Description 文章列表查询
      * @author 杨雪松
      * @date 2018/2/2 18:53
      * @param
      * @return
      */
    @ResponseBody
    @RequestMapping(value="artileList.html",produces = "text/html;charset=UTF-8")
    public String aritleList(String searchContent){
        List<Article> articleList = articleService.selectByArticleNameOrContent(searchContent);
        return JSONUtil.objectToString("列表查询成功",articleList);
    }

     /*
      * @Description 发表文章
      * @author 杨雪松
      * @date 2018/2/2 19:19
      * @param
      * @return
      */
    @ResponseBody
    @RequestMapping(value="publishArticle.html")
    public String publishArticle(Article article){
        try {
            Integer flag = articleService.publishArticle(article);
            if(flag == 1){
                return JSONUtil.objectToString("发表文章成功",null);
            }
            return JSONUtil.objectToString("发表文章失败",null);
        }catch (Exception e){
            log.error("发表文章失败"+e.getMessage(),e);
            return JSONUtil.objectToString("发表文章失败",null);
        }

    }
}
