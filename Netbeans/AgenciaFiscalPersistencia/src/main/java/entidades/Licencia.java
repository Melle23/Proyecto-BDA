/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package entidades;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

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


    @ManyToOne
    @JoinColumn(name = "persona_rfc")
    private Persona persona;
   
    @Column(name = "Vigencia")
    private String vigencia;
        
    @Column(name = "TipoLicencia")
    private String tipo;

    @Column(name = "FechaExpedicion")
    @Temporal(TemporalType.DATE)
    private Date fechaExpedicion;
    
     @Column(name = "costo")
    private Float costo;



    public Licencia() {
    }

    public Licencia( Persona persona, String vigencia, String tipo, Date fechaExpedicion, Float costo) {
      
        this.persona = persona;
        this.vigencia = vigencia;
        this.tipo = tipo;
        this.fechaExpedicion = fechaExpedicion;
        this.costo = costo;
    }

//    public void calcularCosto() {
//     LocalDate fechaActual = LocalDate.now();
//        int añosVigencia = fechaExpedicion.until(fechaActual).getYears();
//        if (añosVigencia < 1 || añosVigencia > 3) {
//            throw new IllegalArgumentException("La vigencia de la licencia debe estar entre 1 y 3 años.");
//        }
//        if (this.tipo.equals("normal")) {
//            switch (añosVigencia) {
//                case 1:
//                    this.costo = 600f;
//                    break;
//                case 2:
//                    this.costo = 900f;
//                    break;
//                case 3:
//                    this.costo = 1100f;
//                    break;
//                default:
//                    throw new IllegalStateException("Vigencia de licencia no válida: " + añosVigencia);
//            }
//        } else if (this.tipo.equals("discapacitados")) {
//            switch (añosVigencia) {
//                case 1:
//                    this.costo = 200f;
//                    break;
//                case 2:
//                    this.costo = 500f;
//                    break;
//                case 3:
//                    this.costo = 700f;
//                    break;
//                default:
//                    throw new IllegalStateException("Vigencia de licencia no válida: " + añosVigencia);
//            }
//        } else {
//            throw new IllegalArgumentException("Tipo de licencia no válido: " + this.tipo);
//        }
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

 

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getVigencia() {
        return vigencia;
    }

    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(Date fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public Float getCosto() {
        return costo;
    }

    public void setCosto(Float costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Licencia{" + "id=" + id + ", persona=" + persona + ", vigencia=" + vigencia + ", tipo=" + tipo + ", fechaExpedicion=" + fechaExpedicion + ", costo=" + costo + '}';
    }
    
}
