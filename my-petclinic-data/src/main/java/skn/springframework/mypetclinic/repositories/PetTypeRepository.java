package skn.springframework.mypetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import skn.springframework.mypetclinic.model.PetType;

@Repository
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
