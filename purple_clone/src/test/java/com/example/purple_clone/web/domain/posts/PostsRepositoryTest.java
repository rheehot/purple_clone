package com.example.purple_clone.web.domain.posts;

import com.example.purple_clone.domain.posts.Posts;
import com.example.purple_clone.domain.posts.PostsRepository;
import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTest {

    @Autowired
    PostsRepository postsRepository;

    @After
    public void cleanup() {
        postsRepository.deleteAll();
    }

    @Test
    public void 게시글저장_불러오기() {
        // given
        String title = "테스트 게시글";
        String content = "테스트 본문";
        Posts sample = Posts.builder()
                .title("테스트 게시글")
                .content("테스트 본문")
                .author("jojoldu@gamil.com")
                .build();

        postsRepository.save(sample);

        // when
        List<Posts> postsList = postsRepository.findAll();

        // then

        Posts posts = postsList.get(0);
        Assert.assertEquals(posts.getTitle(), title);
        Assert.assertEquals(posts.getContent(), content);

    }

    @Test
    public void BaseTimeEntity_등록() {
        // given
        LocalDateTime now = LocalDateTime.of(2019,6,4,0,0,0);
        postsRepository.save(Posts.builder()
                .title("title")
                .content("content")
                .author("author")
                .build());
        // when
        List<Posts> postsList = postsRepository.findAll();

        // then
        Posts posts = postsList.get(0);

        System.out.println(">>>>>>>>>> createDate = "+posts.getCreatedTime()+", modifiedDate="+posts.getModifiedDate());

        Assertions.assertThat(posts.getCreatedTime()).isAfter(now);
        Assertions.assertThat(posts.getModifiedDate()).isAfter(now);
//        Assertions.assertThat(posts.getModifiedDate()).isBefore(now);
    }
}
