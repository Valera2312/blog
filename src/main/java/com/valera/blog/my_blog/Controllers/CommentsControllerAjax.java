package com.valera.blog.my_blog.Controllers;

import com.valera.blog.my_blog.Comment;
import com.valera.blog.my_blog.Repository.CommentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentsControllerAjax {
    @Autowired
    CommentsRepo commentsRepo;

    @RequestMapping(value = {"blog_post/CommentsAdd"}, method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody List<Comment> add(@RequestParam("ArticleId") Long ArticleId,
                                            @RequestParam("name")   String name,
                                            @RequestParam("email")   String email,
                                            @RequestParam("content") String content,
                                            @RequestParam("date") String date )
    {
       // commentsRepo.save();
        Comment comment = new Comment();
        comment.setArticleId(ArticleId);
        comment.setName(name);
        comment.setEMail(email);
        comment.setDate(date);
        comment.setContent(content);
        commentsRepo.save(comment);
        return commentsRepo.findByAndArticleId(ArticleId);
    }
}
