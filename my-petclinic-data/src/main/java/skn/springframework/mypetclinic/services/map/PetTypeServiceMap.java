package skn.springframework.mypetclinic.services.map;

import org.springframework.stereotype.Service;
import skn.springframework.mypetclinic.model.PetType;
import skn.springframework.mypetclinic.services.PetTypeService;

import java.util.Set;

@Service
public class PetTypeServiceMap extends AbstractMapService<PetType,Long> implements PetTypeService {

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetType save(PetType petType) {
        return super.save(petType);
    }

    @Override
    public void delete(PetType petType) {
        super.delete(petType);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

}
