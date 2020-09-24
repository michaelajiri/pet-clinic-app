package com.infotech.petclinicapp.services;

import com.infotech.petclinicapp.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
