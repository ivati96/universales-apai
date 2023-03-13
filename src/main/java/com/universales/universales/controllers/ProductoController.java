package com.universales.universales.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.universales.universales.dto.ProductoDto;
import com.universales.universales.entities.ProductoModel;
import com.universales.universales.services.ProductoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    ProductoService _productoService;

    @GetMapping
    public ResponseEntity<ArrayList<ProductoModel>> obtenerProductos(){
        return ResponseEntity.ok(_productoService.obtenerProductos());
    }

    @PostMapping
    public ResponseEntity<ProductoModel> guardarProducto(@Valid @RequestBody ProductoDto productoDto){
        return ResponseEntity.ok(_productoService.guardarProducto(productoDto));
    }
    
    @GetMapping(path = "{id}")
    public ResponseEntity<Optional<ProductoModel>> obtenerPorId(@PathVariable("id") Long id){
        return ResponseEntity.ok(_productoService.obtenerPorId(id));
    }

    @DeleteMapping(path = "{id}")
    public ResponseEntity<String> eliminarPorId(@PathVariable("id") Long id){
        boolean ok = _productoService.eliminarProducto(id);
        if(ok){
            return ResponseEntity.ok().body("{\"mensaje\": \"Se eliminó correctamente\"}");
        }else{
            return ResponseEntity.ok().body("{\"mensaje\": \"No se eliminó correctamente\"}");
        }
    }
}
