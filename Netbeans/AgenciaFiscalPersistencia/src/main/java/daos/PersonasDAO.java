/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import entidades.Persona;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


/**
 *
 * @author delll
 */
public class PersonasDAO implements IPersonaDAO{
private EntityManagerFactory emf;

    public PersonasDAO() {
        emf = Persistence.createEntityManagerFactory("ConexionPU");
    }

    @Override
    public void RegistrarPersona(Persona persona) {
        System.out.println("llego");
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(persona);
            persona.toString();
            System.out.println("enviado a la bd");
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
    
}
