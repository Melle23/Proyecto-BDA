/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtos;

import entidades.EnumTipoLicencia;
import entidades.EnumVigenciaLicencia;
import java.util.Date;

/**
 *
 * @author delll
 */
public class LicenciaDTO {
    String RFC;
    EnumTipoLicencia tipo;
    EnumVigenciaLicencia vigencia;
    Float costo;
    Date FechaExpedicion;

    public LicenciaDTO(String RFC, EnumTipoLicencia tipo, EnumVigenciaLicencia vigencia, Float costo, Date FechaExpedicion) {
        this.RFC = RFC;
        this.tipo = tipo;
        this.vigencia = vigencia;
        this.costo = costo;
        this.FechaExpedicion = FechaExpedicion;
    }
  

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public EnumTipoLicencia getTipo() {
        return tipo;
    }

    public void setTipo(EnumTipoLicencia tipo) {
        this.tipo = tipo;
    }

    public EnumVigenciaLicencia getVigencia() {
        return vigencia;
    }

    public void setVigencia(EnumVigenciaLicencia vigencia) {
        this.vigencia = vigencia;
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
