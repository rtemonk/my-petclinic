package skn.springframework.mypetclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import skn.springframework.mypetclinic.model.Specialty;
import skn.springframework.mypetclinic.services.SpecialtyService;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class SpecialtyServiceMap extends AbstractMapService<Specialty,Long> implements SpecialtyService {

    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public Specialty findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Specialty save(Specialty specialty) {
        return super.save(specialty);
    }

    @Override
    public void delete(Specialty specialty) {
        super.delete(specialty);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}

