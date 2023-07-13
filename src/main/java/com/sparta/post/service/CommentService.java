package com.sparta.post.service;

import com.sparta.post.dto.CommentRequestDto;
import com.sparta.post.entity.Comment;
import com.sparta.post.entity.Post;
import com.sparta.post.entity.User;
import com.sparta.post.repository.CommentRepository;
import com.sparta.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;
    private final PostRepository postRepository;


    public void createComment(Long postId, CommentRequestDto requestDto, User user) {

        Post post = postRepository.findById(postId).orElseThrow(
                () -> new IllegalArgumentException("게시글이 존재하지 않습니다.")
        );
        Comment comment = new Comment(user,post, requestDto);
        commentRepository.save(comment);
    }
}
