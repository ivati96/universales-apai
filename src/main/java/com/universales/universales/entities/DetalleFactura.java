package com.universales.universales.entities;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "detalle_factura")
public class DetalleFactura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "correlativo", unique = true, nullable = false)
    private Long correlativo;

    @JoinColumns({
        @JoinColumn(name="numero_factura", referencedColumnName="numero_factura"),
        @JoinColumn(name="serie_factura", referencedColumnName="serie_factura")
    })
    @ManyToOne
    private FacturaModel factura;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    private ProductoModel producto;

    @Column(name = "cantidad")
    private int cantidad;

    @Column(name = "precio", precision = 11, scale = 2)
    private BigDecimal precio;

    public Long getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(Long correlativo) {
        this.correlativo = correlativo;
    }

    public FacturaModel getFactura() {
        return factura;
    }

    public void setFactura(FacturaModel factura) {
        this.factura = factura;
    }

    public ProductoModel getProducto() {
        return producto;
    }

    public void setProducto(ProductoModel producto) {
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
