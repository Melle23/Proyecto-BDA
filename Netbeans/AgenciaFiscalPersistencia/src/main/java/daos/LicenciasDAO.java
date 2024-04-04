package daos;

import entidades.Licencia;
import entidades.Persona;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author delll
 */
public class LicenciasDAO implements ILicenciasDAO {
 private EntityManagerFactory emf;
    public LicenciasDAO() {
         emf = Persistence.createEntityManagerFactory("ConexionPU");
    }

    @Override
    public void RegistrarLicencia(Licencia licencia) {
         EntityManager em = emf.createEntityManager();
    try {
        em.getTransaction().begin();
        // Verifica si la persona asociada a la licencia existe en la base de datos
        Persona persona = BuscarPersonaPoRFC(licencia.getRFC());
        if (persona != null) {
            // Asigna la persona encontrada a la licencia
            licencia.setPersona(persona);
            // Persiste la licencia en la base de datos
            System.out.println("DATOS EN LA BASE DE DATOS");
            em.persist(licencia);
            em.getTransaction().commit();
        } else {
            // Si la persona no existe, lanza una excepción o muestra un mensaje de error
            // Aquí te dejo un ejemplo de cómo lanzar una excepción:
            throw new IllegalArgumentException("La persona con RFC " + licencia.getRFC() + " no existe en la base de datos.");
        }
    } finally {
        em.close();
    }
    }

    //Capa persistencia persona
    @Override
    public Persona BuscarPersonaPoRFC(String rfc) {
         EntityManager em = emf.createEntityManager();
               return em.createQuery("SELECT p FROM Persona p WHERE p.rfc = :rfc", Persona.class)
                            .setParameter("rfc", rfc)
                            .getSingleResult();

  
    }
    
}
