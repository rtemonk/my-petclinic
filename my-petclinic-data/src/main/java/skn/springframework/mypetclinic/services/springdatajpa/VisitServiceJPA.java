package skn.springframework.mypetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import skn.springframework.mypetclinic.model.Visit;
import skn.springframework.mypetclinic.repositories.VisitRepository;
import skn.springframework.mypetclinic.services.VisitService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VisitServiceJPA implements VisitService {

    private final VisitRepository visitRepository;

    public VisitServiceJPA(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits = new HashSet<>();
        visitRepository.findAll().forEach(visits::add);
        return visits;
    }

    @Override
    public Visit findById(Long id) {
        return visitRepository.findById(id).orElse(null);
    }

    @Override
    public Visit save(Visit visit) {
        return visitRepository.save(visit);
    }

    @Override
    public void delete(Visit visit) {
        visitRepository.delete(visit);
    }

    @Override
    public void deleteById(Long id) {
        visitRepository.deleteById(id);
    }
}
