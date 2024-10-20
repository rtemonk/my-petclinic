package skn.springframework.mypetclinic.services;

import skn.springframework.mypetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long>{
    Owner findByLastName(String lastName);

}
