package rtemonk.springframework.mypetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rtemonk.springframework.mypetclinic.model.Vet;

@Repository
public interface VetRepository extends CrudRepository<Vet, Long> {
}
