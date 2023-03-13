package com.universales.universales.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.universales.universales.entities.ProductoModel;

@Repository
public interface ProductoRepository extends CrudRepository<ProductoModel, Long> {
    
}
