package consultas;

import dtos.LicenciaDTO;
import entidades.Persona;

/**
 *
 * @author delll
 */
public interface IConsultasLicencias {
    public void registroLicencia(LicenciaDTO l);
    public Persona  BuscaPersonaPorRFC(String rfc);
    
}
