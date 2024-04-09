package daos;

import entidades.Persona;
import java.util.List;



/**
 *
 * @author delll
 */
public interface IPersonaDAO {
    
      public void RegistrarPersona(Persona persona);
      public void insertarPersonas();
      public List<Persona> obtenerPersonas();
}
