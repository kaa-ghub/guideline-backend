package virushack.changing.guideline.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import virushack.changing.guideline.backend.model.Guideline;

@RepositoryRestResource
public interface GuidelineRepository extends JpaRepository<Guideline, String> {
}
