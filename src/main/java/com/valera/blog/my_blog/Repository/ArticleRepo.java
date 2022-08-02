package com.valera.blog.my_blog.Repository;

import com.valera.blog.my_blog.Models.Article;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ArticleRepo extends CrudRepository<Article,Long> {
    List<Article> findAll();
    @Query("select a from Article a where a.category = :id")
    List<Article> findArticleByCategory(@Param("id") Long id);
}
