package com.valera.blog.my_blog.Repository;

import com.valera.blog.my_blog.Models.Article;
import com.valera.blog.my_blog.Models.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CategoriesRepo extends CrudRepository<Category,Long> {
    List<Category> findAll();
}
