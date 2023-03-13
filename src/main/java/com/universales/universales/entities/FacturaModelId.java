package com.universales.universales.entities;

import java.io.Serializable;

public class FacturaModelId implements Serializable {
    private Long numeroFactura;
    
    private String serieFactura;

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
}
