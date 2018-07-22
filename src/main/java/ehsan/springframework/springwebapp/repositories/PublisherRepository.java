package ehsan.springframework.springwebapp.repositories;

import ehsan.springframework.springwebapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher , Long> {
}
