/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtos;


import java.time.LocalDate;
import java.util.Date;


/**
 *
 * @author delll
 */
public class LicenciaDTO {
    String RFC;
    String tipo;
    String vigencia;
    Float costo;
    Date FechaExpedicion;

    public LicenciaDTO(String RFC, String tipo, String vigencia, Float costo, Date FechaExpedicion) {
        this.RFC = RFC;
        this.tipo = tipo;
        this.vigencia = vigencia;
        this.costo = costo;
        this.FechaExpedicion = FechaExpedicion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getVigencia() {
        return vigencia;
    }

    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }
    

  
  

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
