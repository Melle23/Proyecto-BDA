/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import entidades.Licencia;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
            em.persist(licencia);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
    
}
