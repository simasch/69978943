package com.example.so69978943.repository;

import com.example.so69978943.entity.Comment;
import com.example.so69978943.entity.Post;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class PostRepositoryTest {

    @Autowired
    private PostRepository postRepository;

    @Test
    void save() {
        Post post = new Post();
        post.setId(1L);
        post.setTitle("Hello post test");
        post.addComment(new Comment("Hi There"));
        Post savedPost = postRepository.saveAndFlush(post);
    }
}
