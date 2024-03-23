package Control;

import ControladoraPersistencia.ControladoraPersistencia;
import agenciafiscalpresentacion.DlgLicencia;
import agenciafiscalpresentacion.DlgPlacas;
import agenciafiscalpresentacion.DlgRegistro;
import agenciafiscalpresentacion.Menu;
import entidades.Persona;

/**
 *
 * @author molin
 */
public class ControlPresentacion {

    ControladoraPersistencia control = new ControladoraPersistencia();
    
    public ControlPresentacion() {
    }
    
    public void desplegarMenu(){
        Menu desplegarMenu = new Menu();
    }
    
    public void desplegarRegistro(){
        DlgRegistro desplegarRegistro = new DlgRegistro();
    }
    public void desplegarDlgPlacas(){
        DlgPlacas desplegarPlacas = new DlgPlacas();
    }
    
    public void desplegarDlgLicencia(){  
        DlgLicencia desplegarLicencia = new DlgLicencia();
    }

    public void guardarPersona(String RFC, String nombre, String apellidoP, String apellidoM, String telefono, String fechaNacimiento) {

        Persona persona = new Persona();
        persona.setRfc(RFC);
        persona.setNombre(nombre);
        persona.setApellidoP(apellidoP);
        persona.setApellidoM(apellidoM);
        persona.setTelefono(telefono);
        persona.getFechaNacimiento();
        
        control.guardar(persona);
    }
}
