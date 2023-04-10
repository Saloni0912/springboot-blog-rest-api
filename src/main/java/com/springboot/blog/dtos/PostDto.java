package com.springboot.blog.dtos;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Set;

@Data
public class PostDto {
    private long id;

    // title should not be empty or null
    // title should have atleast 2 chars
    @NotEmpty
    @Size(min = 2, message = "Post title should have atleast 2 characters")
    private String title;

    // description should not be empty or null
    // description should have atleast 10 chars
    @NotEmpty
    @Size(min = 10, message = "Post description should have atleast 10 characters")
    private String description;

    // content should not be empty or null
    @NotEmpty
    private String content;

    private Set<CommentDto> comments;
}
