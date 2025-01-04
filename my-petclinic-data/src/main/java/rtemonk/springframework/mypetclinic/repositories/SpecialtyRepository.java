package rtemonk.springframework.mypetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rtemonk.springframework.mypetclinic.model.Specialty;

@Repository
public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
