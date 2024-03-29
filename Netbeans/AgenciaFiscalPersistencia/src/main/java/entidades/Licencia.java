/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package entidades;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author delll
 */
@Entity
@Table(name = "Licencias")
public class Licencia implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "RFC", length = 13)
    String RFC;

    @ManyToOne
    @JoinColumn(name = "id_persona")
    private Persona persona;

    @Enumerated(EnumType.STRING)
    private EnumTipoLicencia tipo;

    @Enumerated(EnumType.STRING)
    private EnumVigenciaLicencia vigencia;

    @Column(name = "FechaExpedicion")
    @Temporal(TemporalType.DATE)
    private Date fechaExpedicion;

    public Licencia() {
    }

    public Licencia(String RFC, Persona persona, EnumTipoLicencia tipo, EnumVigenciaLicencia vigencia, Date fechaExpedicion) {
        this.RFC = RFC;
        this.persona = persona;
        this.tipo = tipo;
        this.vigencia = vigencia;
        this.fechaExpedicion = fechaExpedicion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Date getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(Date fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
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
//

    public int calcularCosto() {
        int costo = 0;

        if (tipo == EnumTipoLicencia.NORMAL) {
            switch (vigencia) {
                case UNO:
                    costo = EnumCostos.DOS_ANIOS_NORMAL.getCosto();
                    break;
                case DOS:
                    costo = EnumCostos.DOS_ANIOS_NORMAL.getCosto();
                    break;
                case TRES:
                    costo = EnumCostos.TRES_ANIOS_NORMAL.getCosto();
                    break;
            }
        } else if (tipo == EnumTipoLicencia.DISCAPACITADOS) {
            switch (vigencia) {
                case UNO:
                    costo = EnumCostos.UN_ANIO_DISCAPACITADOS.getCosto();
                    break;
                case DOS:
                    costo = EnumCostos.DOS_ANIOS_DISCAPACITADOS.getCosto();
                    break;
                case TRES:
                    costo = EnumCostos.TRES_ANIOS_DISCAPACITADOS.getCosto();
                    break;
            }
        }
        return costo;
    }

}
