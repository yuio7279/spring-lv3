package com.sparta.post.dto;

import com.sparta.post.entity.Comment;
import com.sparta.post.entity.Post;
import com.sparta.post.entity.User;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Getter

public class PostResponseDto {
    private Long id;
    private String title;
    private String userName;

    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
    private String msg;

    private User user;
    private List<Comment> commentList;

    public PostResponseDto(Post post) {
        this.id=  post.getId();
        this.title = post.getTitle();
        this.userName = post.getUserName();
        this.content = post.getContent();
        this.createdAt = post.getCreatedAt();
        this.modifiedAt = post.getModifiedAt();
        this.commentList = post.getCommentList();
        this.user = post.getUser();
    }

    public void setMsg(String msg){
        this.msg = msg;
    }
}
