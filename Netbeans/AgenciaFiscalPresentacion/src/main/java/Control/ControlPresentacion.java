package Control;

import agenciafiscalpresentacion.DlgLicencia;
import agenciafiscalpresentacion.DlgPlacas;
import agenciafiscalpresentacion.DlgRegistro;
import agenciafiscalpresentacion.Menu;

/**
 *
 * @author molin
 */
public class ControlPresentacion {

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
}
