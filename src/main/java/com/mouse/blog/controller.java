package com.mouse.blog;

import com.mouse.blog.model.Article;
import com.mouse.blog.service.ArticleService;
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
public class controller {
    @Autowired
    private ArticleService articleService;

    @ResponseBody
    @RequestMapping(value="artileList.html")
    public String aritleList(String searchContent){
        List<Article> articleList = articleService.selectByArticleNameOrContent(searchContent);
        
        return  null;
    }
}
