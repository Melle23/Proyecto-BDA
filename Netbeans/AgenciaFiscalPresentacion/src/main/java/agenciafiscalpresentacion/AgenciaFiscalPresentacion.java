package agenciafiscalpresentacion;

import consultas.ConsultasLicencias;
import consultas.IConsultasLicencias;



/**
 *
 * @author molin
 */
public class AgenciaFiscalPresentacion {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
//            EntityManagerFactory emf = Persistence.createEntityManagerFactory("ConexionPU");
//        EntityManager em = emf.createEntityManager();
//        
//        em.getTransaction().begin();
//        Persona p=new Persona("ssssssssss", "cs", "cs", "cs", "sc", new Date(1998, Calendar.JUNE, 22), "sc");
//        em.persist(p);
//         em.getTransaction().commit();
    IConsultasLicencias licencias;
    licencias =new ConsultasLicencias();
        //System.out.println(licencias.BuscaPersonaPorRFC("rfc"));
    
    }
}
