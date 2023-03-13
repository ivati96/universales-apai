package com.universales.universales.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.universales.universales.entities.FacturaModel;

@Repository
public interface FacturaRepository extends CrudRepository<FacturaModel, Long> {
    
}
