/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtos;

import java.util.Date;

/**
 *
 * @author delll
 */
public class PlacasDTO {
    Long idAuto;
    private String numeroPlacas;
    private Date fechaEmision;
    private Date fechaRecepcion;
    private Float costo;
    private AutomovilesDTO auto;
    private String fechaR;
    private String fechaE;
    

    public PlacasDTO(String numeroPlacas, Date fechaEmision, Date fechaRecepcion, Float costo, AutomovilesDTO auto) {
        this.numeroPlacas = numeroPlacas;
        this.fechaEmision = fechaEmision;
        this.fechaRecepcion = fechaRecepcion;
        this.costo = costo;
        this.auto = auto;
    }

    public PlacasDTO() {
    }

    public String getFechaR() {
        return fechaR;
    }

    public void setFechaR(String fechaR) {
        this.fechaR = fechaR;
    }

    public String getFechaE() {
        return fechaE;
    }

    public void setFechaE(String fechaE) {
        this.fechaE = fechaE;
    }

    

    

    public String getNumeroPlacas() {
        return numeroPlacas;
    }

    public void setNumeroPlacas(String numeroPlacas) {
        this.numeroPlacas = numeroPlacas;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Date getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(Date fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    public Float getCosto() {
        return costo;
    }

    public void setCosto(Float costo) {
        this.costo = costo;
    }

    public AutomovilesDTO getAuto() {
        return auto;
    }

    public void setAuto(AutomovilesDTO auto) {
        this.auto = auto;
    }

    public Long getIdAuto() {
        return idAuto;
    }

    public void setIdAuto(Long idAuto) {
        this.idAuto = idAuto;
    }

    
    

}
