package com.universales.universales.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.universales.universales.enums.SexoEnum;

@RestController
@RequestMapping("/catalogo")
public class CatalogoController {
    @Autowired
    @GetMapping(path = "/sexo")
    public ResponseEntity<SexoEnum[]> sexos(){
        return ResponseEntity.ok(SexoEnum.values());
    }
}
