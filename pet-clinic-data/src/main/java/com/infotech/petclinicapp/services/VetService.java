package com.infotech.petclinicapp.services;

import com.infotech.petclinicapp.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}