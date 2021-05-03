package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Visit;
import guru.springframework.sfgpetclinic.services.VisitService;

import java.util.Set;

public class VisitMapService extends AbstractMapService<Visit,Long> implements VisitService {

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteByID(id);

    }

    @Override
    public Visit findByID(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Visit save(Visit visit) {
        if(visit.getPet()==null||visit.getPet().getId()==null||visit.getPet().getOwner()==null
        ||visit.getPet().getOwner().getId()==null){
            throw new RuntimeException("Invalid Visit");
            return super.save(visit);
        }
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);

    }
}
