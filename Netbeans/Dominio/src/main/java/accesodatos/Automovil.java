package accesodatos;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author molin
 */
@Entity //Especifica la creacion de la entidad
@Inheritance(strategy = InheritanceType.JOINED) //Especica el tipo de herencia
@DiscriminatorColumn(name = "tipo_automovil", discriminatorType = DiscriminatorType.STRING) //Especifica la tabla discriminatoria y el tipo de valor 
public class Automovil implements Serializable {
    
    @Id //Llave primaria de la entidad
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "numeroDeSerie", nullable = false)
    private String numeroDeSerie;
    
    @Column(name = "marca", nullable = false)
    private String marca;
    
    @Column(name = "linea", nullable = false)
    private String linea;
    
    @Column(name = "color", nullable = false)
    private String color;
    
    @Column(name = "modelo", nullable = false)
    private Integer modelo;

    public Automovil() {
    }

    public Automovil(String numeroDeSerie, String marca, String linea, String color, Integer modelo) {
        this.numeroDeSerie = numeroDeSerie;
        this.marca = marca;
        this.linea = linea;
        this.color = color;
        this.modelo = modelo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getModelo() {
        return modelo;
    }

    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Automovil{" + "id=" + id + ", numeroDeSerie=" + numeroDeSerie + ", marca=" + marca + ", linea=" + linea + ", color=" + color + ", modelo=" + modelo + '}';
    } 
}
