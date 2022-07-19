package com.valera.blog.my_blog;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping(path = "/index")
    public String changeStatus(Model model)  {
        boolean isIndex = true;
        model.addAttribute("isIndex", isIndex);
        return "index";
    }
    @GetMapping(path = "/portfolio")
    public String blog_post(Model model)  {
        boolean isPortfolio = true;
        model.addAttribute("isPortfolio", isPortfolio);
        return "portfolio";
    }
}
