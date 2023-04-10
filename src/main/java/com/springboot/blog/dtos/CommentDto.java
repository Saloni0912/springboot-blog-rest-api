package com.springboot.blog.dtos;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Data
public class CommentDto {
    private long id;

    //name should not be null or emtpy
    @NotEmpty(message = "Name should not be null or empty")
    private String name;

    // email should not be null or empty
    //email field validation
    @NotEmpty(message = "Email should not be null or empty")
    @Email
    private String email;

    //comment body should not be null or empty
    //comment body must be min 10 char
    @NotEmpty(message = "Body should not be null or empty")
    @Size(min = 10, message = "Comment body must be min 10 char")
    private String body;
}
