package rtemonk.springframework.mypetclinic.services;

import rtemonk.springframework.mypetclinic.model.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner,Long>{
    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);

}
