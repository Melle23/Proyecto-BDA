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
            if(BuscarPersonaPoRFC(licencia.getRFC())!=null){
                em.persist(licencia);
            em.getTransaction().commit();
            }
            
           } finally {
            em.close();
        }
    }

    @Override
    public Persona BuscarPersonaPoRFC(String rfc) {
           EntityManager em = emf.createEntityManager();
        try {
            Query query = em.createQuery("SELECT p FROM Persona p WHERE p.rfc = :rfc");
            query.setParameter("rfc", rfc);
             List<Persona> resultList = query.getResultList();
            return resultList.isEmpty() ? null : resultList.get(0);
        } finally {
            em.close();
        }
  
    }
    
}
