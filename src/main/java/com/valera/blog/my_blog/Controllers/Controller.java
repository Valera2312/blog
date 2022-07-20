package com.valera.blog.my_blog.Controllers;

import com.valera.blog.my_blog.Models.Article;
import com.valera.blog.my_blog.Repository.ArticleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    ArticleRepo ArticleRepo;

    @RequestMapping(path = "/index")
    public String changeStatus(Model model)  {
        boolean isIndex = true;

        Iterable<Article> allArticles = ArticleRepo.findAll();
        model.addAttribute("allArticles",allArticles);
        model.addAttribute("isIndex", isIndex);
        return "index";
    }
    @RequestMapping(path = "/portfolio")
    public String blog_post(Model model)  {
        boolean isPortfolio = true;
        model.addAttribute("isPortfolio", isPortfolio);
        return "portfolio";
    }
    @RequestMapping(path = "/blog_post")
    public String blog_post(@RequestParam("id") Long id )  {
        return "blog_post";
    }
}
