package com.valera.blog.my_blog.Controllers;

import com.valera.blog.my_blog.Models.Article;
import com.valera.blog.my_blog.Models.Category;
import com.valera.blog.my_blog.Repository.ArticleRepo;
import com.valera.blog.my_blog.Repository.CategoriesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    ArticleRepo ArticleRepo;
    @Autowired
    CategoriesRepo categoriesRepo;

    @RequestMapping(path = "/")
    public String changeStatus(Model model) {
        boolean isIndex = true;
        Iterable<Article> allArticles = ArticleRepo.findAll();
        Iterable<Category> allCategories = categoriesRepo.findAll();
        model.addAttribute("allArticles", allArticles);
        model.addAttribute("allCategories", allCategories);
        model.addAttribute("isIndex", isIndex);
        return "index";
    }

    @RequestMapping(path = "/category/{id}")
    public String blogCategory(@PathVariable Long id, Model model) {
        boolean isIndex = true;
        model.addAttribute("isIndex", isIndex);
        Iterable<Category> allCategories = categoriesRepo.findAll();
        Iterable<Article> articlesById = ArticleRepo.findArticleByCategory(id);
        model.addAttribute("allCategories", allCategories);
        model.addAttribute("articlesById", articlesById);
        return "index";
    }


    @RequestMapping(path = "/portfolio")
    public String blog_post(Model model)  {
        boolean isPortfolio = true;
        model.addAttribute("isPortfolio", isPortfolio);
        return "portfolio";
    }
    @RequestMapping(path = "/blog_post/{id}")
    public String blog_post(@PathVariable  Long id , Model model)  {
        model.addAttribute("id",id);
        return "blog_post";
    }

}
