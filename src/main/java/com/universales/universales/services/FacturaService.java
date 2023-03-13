package com.universales.universales.services;

import java.util.ArrayList;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.universales.universales.dto.FacturaDto;
import com.universales.universales.entities.FacturaModel;
import com.universales.universales.repositories.FacturaRepository;

@Service
public class FacturaService {
    @Autowired
    FacturaRepository _facturaRepository;
    
    @Autowired
    private ModelMapper _modelMapper;

    public ArrayList<FacturaModel> obtenerFacturas(){
        return (ArrayList<FacturaModel>)_facturaRepository.findAll();
    }

    public FacturaModel guardarFactura(FacturaDto facturaDto){
        FacturaModel facturaModel = _modelMapper.map(facturaDto, FacturaModel.class);
        return _facturaRepository.save(facturaModel);
    }

    public Optional<FacturaModel> obtenerPorId(Long id){
        return _facturaRepository.findById(id);
    }

    public boolean eliminarFactura(Long id){
        try {
            _facturaRepository.deleteById(id);
            return true;
        }catch(Exception ex){
            return false;
        }
    }
}
