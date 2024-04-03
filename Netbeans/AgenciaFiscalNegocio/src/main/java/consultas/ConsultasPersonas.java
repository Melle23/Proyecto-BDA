package consultas;

import daos.IPersonaDAO;
import daos.PersonasDAO;
import dtos.PersonasDTO;
import entidades.Persona;

/**
 *
 * @author delll
 */
public class ConsultasPersonas implements IConsultasPersonas{
IPersonaDAO persona;

    public ConsultasPersonas() {
        persona=new PersonasDAO();
    }

    @Override
    public void registroPersona(PersonasDTO p) {
        Persona nuevaPersona=new Persona(p.getRFC(), p.getNombre(), p.getApellidoP(), p.getApellidoM(), p.getTelefono(), p.getFechaNacimiento(), p.getCurp());
        System.out.println("consultaPersonas");
        persona.RegistrarPersona(nuevaPersona);
    }
    
}
