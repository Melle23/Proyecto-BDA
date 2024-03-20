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
public class LicenciaDTO {
    String RFC;
    String tipo;
    int vigencia;
    Float costo;
    Date FechaExpedicion;

  

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }


  

    public Float getCosto() {
        return costo;
    }

    public void setCosto(Float costo) {
        this.costo = costo;
    }

    public Date getFechaExpedicion() {
        return FechaExpedicion;
    }

    public void setFechaExpedicion(Date FechaExpedicion) {
        this.FechaExpedicion = FechaExpedicion;
    }
    
    
}
