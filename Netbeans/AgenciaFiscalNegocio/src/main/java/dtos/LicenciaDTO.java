package dtos;

import entidades.EnumTipoLicencia;
import entidades.EnumVigenciaLicencia;
import java.util.Date;

/**
 *
 * @author delll
 */
public class LicenciaDTO {
    Long id;
    String RFC;
    EnumTipoLicencia tipo;
    EnumVigenciaLicencia vigencia;
    Float costo;
    Date FechaExpedicion;
    boolean activa;
    String Fv;

    public LicenciaDTO(String RFC, EnumTipoLicencia tipo, EnumVigenciaLicencia vigencia, Float costo, Date FechaExpedicion,boolean activa) {
        this.RFC = RFC;
        this.tipo = tipo;
        this.vigencia = vigencia;
        this.costo = costo;
        this.FechaExpedicion = FechaExpedicion;
        this.activa=activa;
    }

    public LicenciaDTO() {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFv() {
        return Fv;
    }

    public void setFv(String Fv) {
        this.Fv = Fv;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }
    
    
}
