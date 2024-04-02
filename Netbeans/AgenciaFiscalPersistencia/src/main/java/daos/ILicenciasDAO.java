package daos;

import entidades.Licencia;
import entidades.Persona;



/**
 *
 * @author delll
 */
public interface ILicenciasDAO {

  public void RegistrarLicencia(Licencia licencia);
  public Persona BuscarPersonaPoRFC(String rfc);
}
