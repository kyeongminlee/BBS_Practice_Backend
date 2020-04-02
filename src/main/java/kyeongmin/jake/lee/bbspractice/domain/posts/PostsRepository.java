package kyeongmin.jake.lee.bbspractice.domain.posts;

import kyeongmin.jake.lee.bbspractice.domain.posts.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
}
