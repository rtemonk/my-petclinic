package skn.springframework.mypetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import skn.springframework.mypetclinic.model.Specialty;
import skn.springframework.mypetclinic.repositories.SpecialtyRepository;
import skn.springframework.mypetclinic.services.SpecialtyService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecialtyServiceJPA implements SpecialtyService {

    private final SpecialtyRepository specialtyRepository;

    public SpecialtyServiceJPA(SpecialtyRepository specialtyRepository) {
        this.specialtyRepository = specialtyRepository;
    }

    @Override
    public Set<Specialty> findAll() {
        Set<Specialty> specialties = new HashSet<>();
        specialtyRepository.findAll().forEach(specialties::add);
        return specialties;
    }

    @Override
    public Specialty findById(Long id) {
        return specialtyRepository.findById(id).orElse(null);
    }

    @Override
    public Specialty save(Specialty obj) {
        return specialtyRepository.save(obj);
    }

    @Override
    public void delete(Specialty obj) {
        specialtyRepository.delete(obj);
    }

    @Override
    public void deleteById(Long id) {
        specialtyRepository.deleteById(id);
    }
}
