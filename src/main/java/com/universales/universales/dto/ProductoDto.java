package com.universales.universales.dto;

import java.math.BigDecimal;

public class ProductoDto {
    private Long idProducto;
    private String producto;
    private int existenciaInicial;
    private int existenciaActual;
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
