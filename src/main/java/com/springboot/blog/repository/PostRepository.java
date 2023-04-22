package com.springboot.blog.repository;

import com.springboot.blog.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//No need to annotate @Repository & @Transactional since JpaRepository Interface has implementation class SimpleJpaRepository which has
//both annotations
//JpaRepository extends PagingAndSortingRepository internally which adds support for Pagination & Sorting
public interface PostRepository extends JpaRepository<Post,Long> {
    List<Post> findByCategoryId(Long categoryId);
}
