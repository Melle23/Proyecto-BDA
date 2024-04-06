package Control;

import agenciafiscalpresentacion.DlgConsultas;
import agenciafiscalpresentacion.DlgHistorial;
import agenciafiscalpresentacion.DlgLicencia;
import agenciafiscalpresentacion.DlgPlacasNuevas;
import agenciafiscalpresentacion.DlgPlacasUsadas;
import agenciafiscalpresentacion.DlgRegistro;
import agenciafiscalpresentacion.DlgReporte;
import agenciafiscalpresentacion.Menu;

/**
 *
 * @author molin
 */
public class ControlPresentacion {

    public ControlPresentacion() {
    }

    public void desplegarMenu() {
        Menu desplegarMenu = new Menu();
    }

    public void desplegarRegistro() {
        DlgRegistro desplegarRegistro = new DlgRegistro();
    }

    public void desplegarDlgLicencia(String nombreSolicitante, String rfc) {
        DlgLicencia dlgLicencia = new DlgLicencia();

        dlgLicencia.mostrarNombreSolicitante(nombreSolicitante);
        dlgLicencia.mostrarRFC(rfc);
        dlgLicencia.setVisible(true);

    }

    public void desplegarDlgLicencia() {
        DlgLicencia dlgLicencia = new DlgLicencia();
    }

    public void desplegarDlgPlacasNuevas() {
        DlgPlacasNuevas dlgPlacasNuevas = new DlgPlacasNuevas();
    }

    public void desplegarDlgPlacasUsadas() {
        DlgPlacasUsadas dlgPlacasUsadas = new DlgPlacasUsadas();

    }

    public void desplegarDlgReporte(){
        DlgReporte dlgReporte = new DlgReporte();
    }
    public void desplegarDlgConsultas(){
        DlgConsultas dlgConsultas=new DlgConsultas();
    }
    public void desplegarDlgHistorial(String rfc){
        DlgHistorial dlgHistorial=new DlgHistorial(rfc);
    }
}
