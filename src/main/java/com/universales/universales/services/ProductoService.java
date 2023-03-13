package com.universales.universales.services;

import java.util.ArrayList;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.universales.universales.dto.ProductoDto;
import com.universales.universales.entities.ProductoModel;
import com.universales.universales.repositories.ProductoRepository;

@Service
public class ProductoService {
    @Autowired
    ProductoRepository _productoRepository;

    @Autowired
    private ModelMapper _modelMapper;

    public ArrayList<ProductoModel> obtenerProductos(){
        return (ArrayList<ProductoModel>)_productoRepository.findAll();
    }

    public ProductoModel guardarProducto(ProductoDto productoDto){
        ProductoModel ProductoModel = _modelMapper.map(productoDto, ProductoModel.class);
        return _productoRepository.save(ProductoModel);
    }

    public Optional<ProductoModel> obtenerPorId(Long id){
        return _productoRepository.findById(id);
    }

    public boolean eliminarProducto(Long id){
        try {
            _productoRepository.deleteById(id);
            return true;
        }catch(Exception ex){
            return false;
        }
    }
}
