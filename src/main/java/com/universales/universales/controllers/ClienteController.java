package com.universales.universales.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.universales.universales.dto.ClienteDto;
import com.universales.universales.entities.ClienteModel;
import com.universales.universales.services.ClienteService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    ClienteService _clienteService;

    @GetMapping
    public ResponseEntity<ArrayList<ClienteModel>> obtenerClientes(){
        return ResponseEntity.ok(_clienteService.obtenerClientes());
    }

    @PostMapping
    public ResponseEntity<ClienteModel> guardarCliente(@Valid @RequestBody ClienteDto clienteDto){
        return ResponseEntity.ok(_clienteService.guardarCliente(clienteDto));
    }
    
    @GetMapping(path = "{id}")
    public ResponseEntity<ClienteModel> obtenerPorId(@PathVariable("id") Long id){
        return ResponseEntity.ok(_clienteService.obtenerPorId(id).get());
    }

    @DeleteMapping(path = "{id}")
    public ResponseEntity<String> eliminarPorId(@PathVariable("id") Long id){
        boolean ok = _clienteService.eliminarCliente(id);
        if(ok){
            return ResponseEntity.ok().body("{\"mensaje\": \"Se eliminó correctamente\"}");
        }else{
            return ResponseEntity.ok().body("{\"mensaje\": \"No se eliminó correctamente\"}");
        }
    }
}
