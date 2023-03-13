package com.universales.universales.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.universales.universales.entities.ClienteModel;

@Repository
public interface ClienteRepository extends CrudRepository<ClienteModel, Long> {
    
}
