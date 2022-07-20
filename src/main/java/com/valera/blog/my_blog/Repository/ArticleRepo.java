package com.valera.blog.my_blog.Repository;

import com.valera.blog.my_blog.Models.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ArticleRepo extends CrudRepository<Article,Long> {
    List<Article> findAll();
}
