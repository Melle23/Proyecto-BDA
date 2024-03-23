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

    public LicenciaDTO(String RFC, String tipo, int vigencia, Float costo, Date FechaExpedicion) {
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVigencia() {
        return vigencia;
    }

    public void setVigencia(int vigencia) {
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
