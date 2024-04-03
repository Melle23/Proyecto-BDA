package Control;

import agenciafiscalpresentacion.DlgLicencia;
import agenciafiscalpresentacion.DlgPlacasNuevas;
import agenciafiscalpresentacion.DlgPlacasUsadas;
import agenciafiscalpresentacion.DlgRegistro;
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
        DlgLicencia dlgLicencia = new DlgLicencia(null, true);

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

}
