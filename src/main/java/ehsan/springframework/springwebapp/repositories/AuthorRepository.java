package ehsan.springframework.springwebapp.repositories;

import ehsan.springframework.springwebapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author , Long> {
}
