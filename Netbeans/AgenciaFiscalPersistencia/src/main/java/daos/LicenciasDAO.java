package daos;

import entidades.Licencia;
import entidades.Persona;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

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
        
            em.getTransaction().begin();
            if(BuscarPersonaPoRFC(licencia.getRFC())!=null){
                em.persist(licencia);
            em.getTransaction().commit();
            }
            
           
    }

    @Override
    public Persona BuscarPersonaPoRFC(String rfc) {
         EntityManager em = emf.createEntityManager();
            TypedQuery<Persona> query = em.createQuery(
            "SELECT p FROM Persona p WHERE p.rfc = :rfc", Persona.class);
        query.setParameter("rfc", rfc);

        // Ejecutar la consulta y obtener los resultados
        List<Persona> personas = query.getResultList();

        // Verificar si se encontró al menos una persona
        if (!personas.isEmpty()) {
            return personas.get(0); // Devolver la primera persona encontrada
        } else {
            System.out.println("No se encontró ninguna persona con ese RFC.");
            return null;
        } 
//        TypedQuery<Persona> query = em.createQuery(
//            "SELECT p FROM Persona p WHERE p.rfc = :rfc", Persona.class);
//        query.setParameter("rfc", rfc);
//
//        try {
//            return query.getSingleResult();
//        } catch (javax.persistence.NoResultException e) {
//            System.out.println("No se encontró ninguna persona con ese RFC.");
//        } catch (javax.persistence.NonUniqueResultException e) {
//            System.out.println("Se encontraron múltiples personas con el mismo RFC.");
//        }
//
//        return null;
    }

    
}
