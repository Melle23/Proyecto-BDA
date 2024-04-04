/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import entidades.Automovil;
import entidades.Placa;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author delll
 */
public class PlacasDAO implements IPlacasDAO  {
    private EntityManagerFactory emf;

    public PlacasDAO() {
          emf = Persistence.createEntityManagerFactory("ConexionPU");
    }

    @Override
    public void AgregarPlacasNuevas(Placa p, Automovil a) {
          //System.out.println("llego");        
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(a);
            em.persist(p);
            a.toString();
            p.toString();
            System.out.println("enviado a la bd");
            em.getTransaction().commit();
        } catch (Exception e) {
            e.getMessage();

        } finally {
            em.close();

        }
    }

    @Override
    public void AgregarPlacasUsadas(Placa p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Placa BuscarPlacas(String p) {
 EntityManager em = emf.createEntityManager();
        return em.createQuery("SELECT p FROM Placa p WHERE p.numeroPlacas = :p", Placa.class)
                            .setParameter("numeroSerie", p)
                            .getSingleResult();

    }
}   
