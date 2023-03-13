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

import com.universales.universales.dto.FacturaDto;
import com.universales.universales.entities.FacturaModel;
import com.universales.universales.services.FacturaService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/factura")
public class FacturaController {
    @Autowired
    FacturaService _facturaService;

    @GetMapping
    public ResponseEntity<ArrayList<FacturaModel>> obtenerFacturas(){
        return ResponseEntity.ok(_facturaService.obtenerFacturas());
    }

    @PostMapping
    public ResponseEntity<FacturaModel> guardarCliente(@Valid @RequestBody FacturaDto facturaDto){
        return ResponseEntity.ok(_facturaService.guardarFactura(facturaDto));
    }
    
    @GetMapping(path = "{id}")
    public ResponseEntity<FacturaModel> obtenerPorId(@PathVariable("id") Long id){
        return ResponseEntity.ok(_facturaService.obtenerPorId(id).get());
    }

    @DeleteMapping(path = "{id}")
    public ResponseEntity<String> eliminarPorId(@PathVariable("id") Long id){
        boolean ok = _facturaService.eliminarFactura(id);
        if(ok){
            return ResponseEntity.ok().body("{\"mensaje\": \"Se eliminó correctamente\"}");
        }else{
            return ResponseEntity.ok().body("{\"mensaje\": \"No se eliminó correctamente\"}");
        }
    }

}
