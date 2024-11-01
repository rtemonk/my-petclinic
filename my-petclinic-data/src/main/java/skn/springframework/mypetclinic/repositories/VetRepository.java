package skn.springframework.mypetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import skn.springframework.mypetclinic.model.Vet;

@Repository
public interface VetRepository extends CrudRepository<Vet, Long> {
}
