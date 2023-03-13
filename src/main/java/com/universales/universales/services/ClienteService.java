package com.universales.universales.services;

import java.util.ArrayList;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.universales.universales.dto.ClienteDto;
import com.universales.universales.entities.ClienteModel;
import com.universales.universales.repositories.ClienteRepository;

@Service
public class ClienteService {
    @Autowired
    ClienteRepository _clienteRepository;

    @Autowired
    private ModelMapper _modelMapper;

    public ArrayList<ClienteModel> obtenerClientes(){
        return (ArrayList<ClienteModel>)_clienteRepository.findAll();
    }

    public ClienteModel guardarCliente(ClienteDto clienteDto){
        ClienteModel clienteModel = _modelMapper.map(clienteDto, ClienteModel.class);
        return _clienteRepository.save(clienteModel);
    }

    public Optional<ClienteModel> obtenerPorId(Long id){
        return _clienteRepository.findById(id);
    }

    public boolean eliminarCliente(Long id){
        try {
            _clienteRepository.deleteById(id);
            return true;
        }catch(Exception ex){
            return false;
        }
    }
}
