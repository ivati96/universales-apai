package com.universales.universales.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@IdClass(FacturaModelId.class)
@Table(name = "factura")
public class FacturaModel {
    @Id
    @Column(name = "numero_factura", unique = true, nullable = false)
    private Long numeroFactura;
    
    @Id
    @Column(name = "serie_factura", unique = true, nullable = false, length = 10)
    private String serieFactura;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private ClienteModel cliente;

    @Column(name = "fecha")
    private Date fecha;

    public Long getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(Long numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getSerieFactura() {
        return serieFactura;
    }

    public void setSerieFactura(String serieFactura) {
        this.serieFactura = serieFactura;
    }

    public ClienteModel getCliente() {
        return cliente;
    }

    public void setCliente(ClienteModel cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
