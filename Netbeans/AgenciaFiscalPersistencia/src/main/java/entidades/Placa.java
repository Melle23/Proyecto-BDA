/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author delll
 */
@Entity
@Table(name = "placas")
public class Placa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "PlacasUsado")
    private String numeroPlacasAnt;
    @Column(name = "numero")
    private String numero;

    @Column(name = "fecha_emision")
    private Date fechaEmision;

    @Column(name = "fecha_recepcion")
    private Date fechaRecepcion;

    @Column(name = "costo")
    private Float costo;

      
    @ManyToOne
    @JoinColumn(name = "id_automovil")
    private Automovil automovil;

    public Placa() {
    }

    public Placa(String numeroPlacasAnt, String numero, Date fechaEmision, Date fechaRecepcion, Float costo, Automovil automovil) {
        this.numeroPlacasAnt = numeroPlacasAnt;
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.fechaRecepcion = fechaRecepcion;
        this.costo = costo;
        this.automovil = automovil;
    }
    

    public void calcularCosto() {
        if (this.numeroPlacasAnt == null) {
            // Si no hay número de placas anteriores, es un automóvil nuevo
            this.costo = 1500f;
        } else {
            // Si hay número de placas anteriores, es un automóvil usado
            this.costo = 1000f;
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroPlacasAnt() {
        return numeroPlacasAnt;
    }

    public void setNumeroPlacasAnt(String numeroPlacasAnt) {
        this.numeroPlacasAnt = numeroPlacasAnt;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
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

    public Automovil getAutomovil() {
        return automovil;
    }

    public void setAutomovil(Automovil automovil) {
        this.automovil = automovil;
    }

    @Override
    public String toString() {
        return "Placa{" + "id=" + id + ", numeroPlacasAnt=" + numeroPlacasAnt + ", numero=" + numero + ", fechaEmision=" + fechaEmision + ", fechaRecepcion=" + fechaRecepcion + ", costo=" + costo + ", automovil=" + automovil + '}';
    }
    
}
