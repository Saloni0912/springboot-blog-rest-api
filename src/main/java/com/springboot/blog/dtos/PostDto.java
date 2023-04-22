package com.springboot.blog.dtos;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Set;

@Data
@Schema(
        description = "PostDto Model Information"
)
public class PostDto {
    private long id;

    @Schema(
            description = "Blog Post Title"
    )
    // title should not be empty or null
    // title should have atleast 2 chars
    @NotEmpty
    @Size(min = 2, message = "Post title should have atleast 2 characters")
    private String title;

    @Schema(
            description = "Blog Post Description"
    )
    // description should not be empty or null
    // description should have atleast 10 chars
    @NotEmpty
    @Size(min = 10, message = "Post description should have atleast 10 characters")
    private String description;

    @Schema(
            description = "Blog Post Content"
    )
    // content should not be empty or null
    @NotEmpty
    private String content;

    private Set<CommentDto> comments;

    @Schema(
            description = "Blog Post Category"
    )
    private Long categoryId;
}
