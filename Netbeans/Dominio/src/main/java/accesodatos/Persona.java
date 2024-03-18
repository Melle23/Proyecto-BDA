package accesodatos;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author delll
 */
@Entity //Especifica la creacion de la entidad
public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "RFC", nullable = false, length = 13)
    private String RFC;

    @Column(name = "Nombre_Completo", nullable = false)
    private String nombre_completo;

    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;

    @Column(name = "Telefono", nullable = false, length = 10)
    private String telefono;

    public Persona() {
    }

    public Persona(String RFC, String nombre_completo, Date fechaNacimiento, String telefono) {
        this.RFC = RFC;
        this.nombre_completo = nombre_completo;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
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

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", RFC=" + RFC + ", nombre_completo=" + nombre_completo + ", fechaNacimiento=" + fechaNacimiento + ", telefono=" + telefono + '}';
    }

}
