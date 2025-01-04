package rtemonk.springframework.mypetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rtemonk.springframework.mypetclinic.model.Visit;

@Repository
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
