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
        System.out.println(l.getRFC());
        //persona=BuscaPersonaPorRFC(l.getRFC());
         Licencia nuevaLicencia=new Licencia(BuscaPersonaPorRFC(l.getRFC()), l.getVigencia(), l.getTipo(), l.getFechaExpedicion(),l.getCosto());
        System.out.println("consultaLicencias");
        licencias.RegistrarLicencia(nuevaLicencia);
    }

    @Override
    public Persona BuscaPersonaPorRFC(String rfc) {
        persona=licencias.BuscarPersonaPoRFC(rfc);
        return persona;
        
    }
    
}
