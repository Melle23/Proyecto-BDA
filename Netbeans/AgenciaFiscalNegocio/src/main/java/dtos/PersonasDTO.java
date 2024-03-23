package dtos;

import java.util.Date;

/**
 *
 * @author delll
 */
public class PersonasDTO {

    String RFC;
    String Nombre;
    String ApellidoM;
    String ApellidoP;
    String Telefono;
    Date FechaNacimiento;

    public PersonasDTO(String RFC, String Nombre, String ApellidoP, String ApellidoM, String Telefono, Date FechaNacimiento) {
        this.RFC = RFC;
        this.Nombre = Nombre;
        this.ApellidoP = ApellidoP;
        this.ApellidoM = ApellidoM;
        this.Telefono = Telefono;
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidoM() {
        return ApellidoM;
    }

    public void setApellidoM(String ApellidoM) {
        this.ApellidoM = ApellidoM;
    }

    public String getApellidoP() {
        return ApellidoP;
    }

    public void setApellidoP(String ApellidoP) {
        this.ApellidoP = ApellidoP;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

}
