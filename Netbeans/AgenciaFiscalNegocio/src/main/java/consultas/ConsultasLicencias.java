package consultas;

import daos.ILicenciasDAO;
import daos.LicenciasDAO;
import dtos.LicenciaDTO;
import entidades.Licencia;
import entidades.Persona;

/**
 *
 * @author delll
 */
public class ConsultasLicencias implements IConsultasLicencias {
    ILicenciasDAO licencias;
    Persona persona;

    public ConsultasLicencias() {
        licencias=new LicenciasDAO();
    }
    
    @Override
    public void registroLicencia(LicenciaDTO l) {
        persona=BuscaPersonaPorRFC(l.getRFC());
         Licencia nuevaLicencia=new Licencia(l.getRFC(), persona,l.getTipo(),l.getVigencia(),l.getFechaExpedicion());
        System.out.println("consultaLicencias");
        licencias.RegistrarLicencia(nuevaLicencia);
    }

    @Override
    public Persona BuscaPersonaPorRFC(String rfc) {
        return licencias.BuscarPersonaPoRFC(rfc);
        
    }
    
}
