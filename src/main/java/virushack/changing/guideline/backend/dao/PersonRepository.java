package virushack.changing.guideline.backend.dao;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import virushack.changing.guideline.backend.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

@CrossOrigin
@RepositoryRestResource
public interface PersonRepository extends JpaRepository<Person, Long> {
}
