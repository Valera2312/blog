package com.valera.blog.my_blog.Controllers;

import com.valera.blog.my_blog.Comment;
import com.valera.blog.my_blog.Repository.CommentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentsController {
    @Autowired
    CommentsRepo commentsRepo;

    @RequestMapping(value = {"CommentsAdd"}, method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody List<Comment> add(@RequestParam("id")Long id){

        //commentsRepo.save(new Comment());
        return commentsRepo.findByAndArticleId(id);
    }
}
