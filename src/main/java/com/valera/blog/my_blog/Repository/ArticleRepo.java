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
    @Query( value = "SELECT * FROM article WHERE category_id = :id",nativeQuery = true)
    Article findArticleByCategory(@Param("id") Long id);

    @Query(value = "SELECT * FROM article ORDER BY ID DESC LIMIT 5", nativeQuery = true)
    List<Article> findLast5Articles();
}
