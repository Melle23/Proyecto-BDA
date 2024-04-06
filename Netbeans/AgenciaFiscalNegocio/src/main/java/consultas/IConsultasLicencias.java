package consultas;

import dtos.LicenciaDTO;
import entidades.Persona;
import java.util.List;

/**
 *
 * @author delll
 */
public interface IConsultasLicencias {
    public void registroLicencia(LicenciaDTO l);
    public Persona  BuscaPersonaPorRFC(String rfc);
        public List<LicenciaDTO> listaLicencias(String rfc);

}
