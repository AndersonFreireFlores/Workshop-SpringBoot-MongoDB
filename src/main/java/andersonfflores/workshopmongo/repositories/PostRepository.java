package andersonfflores.workshopmongo.repositories;

import andersonfflores.workshopmongo.domain.Post;
import andersonfflores.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {}
