package com.universales.universales.entities;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class ProductoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto", unique = true, nullable = false)
    private Long idProducto;

    @Column(name = "producto", length = 100, nullable = false)
    private String producto;

    @Column(name = "existencia_inicial")
    private int existenciaInicial;

    @Column(name = "existencia_actual")
    private int existenciaActual;

    @Column(name = "precio_actual", precision = 11, scale = 2)
    private BigDecimal precioActual;

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }
    
    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getExistenciaInicial() {
        return existenciaInicial;
    }

    public void setExistenciaInicial(int existenciaInicial) {
        this.existenciaInicial = existenciaInicial;
    }

    public int getExistenciaActual() {
        return existenciaActual;
    }

    public void setExistenciaActual(int existenciaActual) {
        this.existenciaActual = existenciaActual;
    }

    public BigDecimal getPrecioActual() {
        return precioActual;
    }

    public void setPrecioActual(BigDecimal precioActual) {
        this.precioActual = precioActual;
    }
}
