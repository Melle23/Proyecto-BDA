package daos;

import Encriptacion.EncriptacionDatos;
import entidades.Persona;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author delll
 */
public class PersonasDAO implements IPersonaDAO {

    private EntityManagerFactory emf;

    public PersonasDAO() {
        emf = Persistence.createEntityManagerFactory("ConexionPU");
    }

    @Override
    public void RegistrarPersona(Persona persona) {

        //System.out.println("llego");        
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            
            String telefonoEncriptado = EncriptacionDatos.encriptar(persona.getTelefono());
            persona.setTelefono(telefonoEncriptado);
            
            em.persist(persona);
            persona.toString();
            System.out.println("enviado a la bd");
            em.getTransaction().commit();
        } catch (Exception e) {
            e.getMessage();

        } finally {
            em.close();

        }
    }
}
