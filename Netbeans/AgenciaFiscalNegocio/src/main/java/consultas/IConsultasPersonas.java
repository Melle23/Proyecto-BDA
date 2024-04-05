package consultas;

import dtos.PersonasDTO;
import entidades.Persona;
import java.util.List;

/**
 *
 * @author delll
 */
public interface IConsultasPersonas {
    public void registroPersona(PersonasDTO p);
    public List<PersonasDTO> obtenerListaPersonas();
    public List<PersonasDTO> convertirPersonasADTOs(List<Persona> personas);
}
