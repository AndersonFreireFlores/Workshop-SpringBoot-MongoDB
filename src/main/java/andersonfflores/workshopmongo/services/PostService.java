package andersonfflores.workshopmongo.services;

import andersonfflores.workshopmongo.domain.Post;
import andersonfflores.workshopmongo.domain.User;
import andersonfflores.workshopmongo.dto.UserDTO;
import andersonfflores.workshopmongo.repositories.PostRepository;
import andersonfflores.workshopmongo.repositories.UserRepository;
import andersonfflores.workshopmongo.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {


    @Autowired
    private PostRepository repository;


    public Post findById(String id) {
        Optional<Post> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post> findByTitle(String text){
        return repository.findByTitleContaining(text);
    }
}

