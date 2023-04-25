package com.springboot.blog.repository;

import com.springboot.blog.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//No need to annotate @Repository & @Transactional since JpaRepository Interface has implementation class SimpleJpaRepository which has
//both annotations
//JpaRepository extends PagingAndSortingRepository internally which adds support for Pagination & Sorting
public interface PostRepository extends JpaRepository<Post,Long> {
    List<Post> findByCategoryId(Long categoryId);

    //Using JPQL Query to search products
    @Query("SELECT p FROM Post p WHERE " + "p.title LIKE CONCAT('%',:query,'%')" + "Or p.description LIKE CONCAT('%', :query, '%')")
    List<Post> searchPosts(String query);

    //Using SQL query
    @Query(value = "SELECT * FROM posts p WHERE " + "p.name LIKE CONCAT('%', :query, '%')" + "Or p.description LIKE CONCAT('%', :query, '%')", nativeQuery = true)
    List<Post> searchPostsSQL(String query);
}
