package rtemonk.springframework.mypetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rtemonk.springframework.mypetclinic.model.Pet;

@Repository
public interface PetRepository extends CrudRepository<Pet, Long> {
}
