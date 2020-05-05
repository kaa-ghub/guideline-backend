package virushack.changing.guideline.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import virushack.changing.guideline.backend.model.Doctor;

@CrossOrigin
@RepositoryRestResource
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
