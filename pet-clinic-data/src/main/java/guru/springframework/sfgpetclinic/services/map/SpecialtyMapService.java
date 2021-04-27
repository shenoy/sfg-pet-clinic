package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Specialty;
import guru.springframework.sfgpetclinic.services.SpecialtiesService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialtyMapService extends AbstractMapService<Specialty,Long> implements SpecialtiesService {
    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteByID(id);

    }

    @Override
    public void delete(Specialty object) {
        super.delete(object);

    }

    @Override
    public Specialty save(Specialty object) {
        return super.save(object);
    }

    @Override
    public Specialty findByID(Long id) {
        return super.findById(id);
    }
}
