
package ControladoraPersistencia;

import entidades.Persona;

/**
 *
 * @author molin
 */
public class ControladoraPersistencia {
    
    LicenciaJpaController licenciaJpa = new LicenciaJpaController();
    PersonaJpaController personaJpa = new PersonaJpaController();

    public void guardar(Persona persona) {
        personaJpa.create(persona);
    }

   

    
}
