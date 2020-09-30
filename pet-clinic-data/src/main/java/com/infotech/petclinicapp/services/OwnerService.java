package com.infotech.petclinicapp.services;

import com.infotech.petclinicapp.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}