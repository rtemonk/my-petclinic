package skn.springframework.mypetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import skn.springframework.mypetclinic.model.Pet;

@Repository
public interface PetRepository extends CrudRepository<Pet, Long> {
}
