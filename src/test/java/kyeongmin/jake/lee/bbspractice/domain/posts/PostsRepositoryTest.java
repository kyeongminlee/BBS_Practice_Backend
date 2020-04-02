package kyeongmin.jake.lee.bbspractice.domain.posts;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PostsRepositoryTest {

    @Autowired
    PostsRepository postsRepository;

    @AfterEach
    void cleanUp() {
        postsRepository.deleteAll();
    }

    @Test
    void 게시글조회() {
        // given
        String title = "테스트 게시글";
        String content = "테스트 본문";
        String author = "ekmst1027@gmail.com";

        Posts posts = Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();

        postsRepository.save(posts);

        // when
        List<Posts> postsList = postsRepository.findAll();

        // then
        Posts firstPost = postsList.get(0);
        assertEquals(firstPost.getTitle(), title);
        assertEquals(firstPost.getContent(), content);
        assertEquals(firstPost.getAuthor(), author);

    }

}