package agenciafiscalpresentacion;

import daos.ILicenciasDAO;
import daos.LicenciasDAO;
import dtos.PersonasDTO;
import entidades.Persona;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author molin
 */
public class AgenciaFiscalPresentacion {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        ILicenciasDAO lic;
        lic=new LicenciasDAO();
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("ConexionPU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
//        String rfc="a";
//        System.out.println(lic.BuscarPersonaPoRFC(rfc));
        
//        Persona p=new Persona("ssssssssss", "cs", "cs", "cs", "sc", new Date(1998, Calendar.JUNE, 22), "sc");
//        em.persist(p);
        
        // Construir la consulta JPQL
        String jpql = "SELECT p FROM Persona p WHERE p.rfc = :rfc";

        // Ejecutar la consulta
        Query query = em.createQuery(jpql);
        query.setParameter("rfc", "sc");

        // Obtener el resultado
        List<Persona> personas = query.getResultList();

        // Iterar sobre el resultado (puede haber una o ninguna persona con el RFC especificado)
        for (Persona persona : personas) {
            System.out.println("Persona encontrada: " + persona.getNombre()); // Aquí podrías imprimir más detalles de la persona si lo deseas
        }

         em.getTransaction().commit();
    }
}
