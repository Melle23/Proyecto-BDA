package consultas;

import daos.IPersonaDAO;
import daos.PersonasDAO;
import dtos.PersonasDTO;
import entidades.Persona;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 *
 * @author delll
 */
public class ConsultasPersonas implements IConsultasPersonas{
IPersonaDAO persona;
private boolean registroEnviado = false;
    public ConsultasPersonas() {
        persona=new PersonasDAO();
    }

    @Override
    public void registroPersona(PersonasDTO p) {
        Persona nuevaPersona=new Persona(p.getNombre(), p.getApellidoP(), p.getApellidoM(), p.getTelefono(), p.getRFC(), p.getFechaNacimiento(),p.getCurp());
        System.out.println("consultaPersonas");
        persona.RegistrarPersona(nuevaPersona);
    }
        @Override
   public List<PersonasDTO> obtenerListaPersonas() {
        List<Persona> personas = persona.obtenerPersonas(); // Obtener personas desde la base de datos
        return convertirPersonasADTOs(personas);
    }
       @Override
    public List<PersonasDTO> convertirPersonasADTOs(List<Persona> personas) {
        List<PersonasDTO> personasDTO = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
     
        for (Persona p : personas) {
            PersonasDTO personaDTO = new PersonasDTO();
            String fechaFormateada = sdf.format(p.getFechaNacimiento());
            personaDTO.setNombre(p.getNombre());
            personaDTO.setRFC(p.getRfc());
            personaDTO.setApellidoP(p.getApellidoP());
            personaDTO.setApellidoM(p.getApellidoM());
            personaDTO.setFecha(fechaFormateada);
            personaDTO.setFechaNacimiento(p.getFechaNacimiento());
            personaDTO.setCurp(p.getCurp());
            personaDTO.setTelefono(p.getTelefono());
            
            
            personasDTO.add(personaDTO);
        }
        return personasDTO;
    }
    
@Override
    public void insercion(){
         if (!registroEnviado) {
        persona.insercion();
        registroEnviado = true;
    } else {
        System.out.println("El registro ya ha sido enviado previamente.");
    }
  }
   
}

