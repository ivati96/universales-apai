package com.universales.universales.dto;

import java.math.BigDecimal;

public class DetalleFacturaDto {
    private Long correlativo;
    private FacturaDto factura;
    private ProductoDto producto;
    private int cantidad;
    private BigDecimal precio;

    public Long getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(Long correlativo) {
        this.correlativo = correlativo;
    }

    public FacturaDto getFactura() {
        return factura;
    }

    public void setFactura(FacturaDto factura) {
        this.factura = factura;
    }

    public ProductoDto getProducto() {
        return producto;
    }

    public void setProducto(ProductoDto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
}
