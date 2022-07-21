package com.valera.blog.my_blog.Repository;

import com.valera.blog.my_blog.Comment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CommentsRepo extends CrudRepository<Comment,Long> {

    @Query("select e from Comment e where e.articleId = :id")
    List<Comment> findByAndArticleId(@Param("id") Long id);
    
}
