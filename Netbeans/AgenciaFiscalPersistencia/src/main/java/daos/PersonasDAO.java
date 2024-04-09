package daos;

import Encriptacion.EncriptacionDatos;
import static Encriptacion.EncriptacionDatos.encriptar;
import entidades.Persona;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import java.util.Date;
import java.util.GregorianCalendar;

import java.util.List;
import java.util.Random;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.swing.JOptionPane;

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

    @Override
    public List<Persona> obtenerPersonas() {
         EntityManager em = emf.createEntityManager();
        
        String jpql = "SELECT p FROM Persona p"; // JPQL para seleccionar todas las personas
        Query query = em.createQuery(jpql);
        return query.getResultList();
       

    }

    @Override
    public void insertarPersonas() {
        boolean personasInsertadas = false;
        EntityManager em = emf.createEntityManager();

        try {
            // Verificar si las personas ya han sido insertadas
            CriteriaBuilder cb = emf.getCriteriaBuilder();
            CriteriaQuery<Long> countQuery = cb.createQuery(Long.class);
            Root<Persona> root = countQuery.from(Persona.class);
            countQuery.select(cb.count(root));
            Long count = em.createQuery(countQuery).getSingleResult();
            

            if (count > 0) {
                JOptionPane.showMessageDialog(null, "Las personas ya han sido insertadas anteriormente.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                Persona persona1 = new Persona("Adriana", "Gutierrez", "Robles", "6448989093", "GURA030404EG3", new Date(2003, 04, 04), "LUMA971230MSPRNS16");
                Persona persona2 = new Persona("Valeria", "Molina", "Estrada", "6871178335", "VARA030404EG4", new Date(2002, 02, 14), "LOPR930609MMCSMS01");
                Persona persona3 = new Persona("Kamila", "Nuñez", "Choix", "6448676093", "KAR4030404EG3", new Date(2004, 01, 03), "KAPR930609MMCSDS01");
                Persona persona4 = new Persona("Alexa", "Picos", "Valenzuela", "6445985093", "RA030404EG3", new Date(2004, 8, 23), "ALPV923609MMCSMS01");
                Persona persona5 = new Persona("Karim", "Franco", "Valecia", "6448989103", "KAFE030404EG3", new Date(2004, 04, 04), "KFVR930609MMCSMS01");
                Persona persona6 = new Persona("Kimberli", "Matinez", "Sandoval", "6448978093", "KMSA030404EG3", new Date(2003, 04, 04), "KMPR930609MMCSMS01");
                Persona persona7 = new Persona("Alfredo", "Meza", "Gonzalez", "6738989093", "AMGA030404EG3", new Date(2004, 07, 04), "AMGR930609MMCSMS01");
                Persona persona8 = new Persona("Gerardo", "Molina", "Estrada", "6874989093", "GMEA030404EG3", new Date(1998, 9, 04), "GMER930609MMCSMS01");
                Persona persona9 = new Persona("Ohtani", "Shohei", "Estrada", "6871329609", "SOHA030404EG3", new Date(1994, 07, 05), "SHOR930609MMCSMS01");
                Persona persona10 = new Persona("Carmen", "Estrada", "Gutierrez", "6438989093", "MACA030404EG3", new Date(1973, 12, 13), "MCPR930609MMCSMS01");
                Persona persona11 = new Persona("Jake", "Estrada", "Shim", "6435989093", "HDFA030404EG3", new Date(2002, 04, 013), "JKPR930609MMCSMS01");
                Persona persona12 = new Persona("Efren", "Estrada", "Luque", "6448989093", "EFURA03044327", new Date(2004, 04, 04), "LOPR930609MMCSMS01");
                Persona persona13 = new Persona("Gerardo", "Molina", "Contreras", "6738989093", "GMCA030404EG3", new Date(1974, 04, 04), "GMPR930609MMCSMS01");
                Persona persona14 = new Persona("Alicia", "Ramos", "Flores", "6738989093", "ALMA030404EG3", new Date(2004, 02, 23), "ALMR930609MMCSMS01");
                Persona persona15 = new Persona("Victor", "Encinas", "Guzman", "6448989093", "VERA030404EG3", new Date(2004, 06, 16), "VEGR930609MMCSMS01");
                Persona persona16 = new Persona("Aidil", "Leal", "Armenta", "6878989093", "GALA030404EG3", new Date(2004, 04, 04), "LOPR930609MMCSMS01");
                Persona persona17 = new Persona("Jose Maria", "Armenta", "Robles", "6448989093", "GURA030404EG3", new Date(2004, 04, 04), "LOPR930609MMCSMS01");
                Persona persona18 = new Persona("Cristian", "Cepeda", "Ramirez", "6423989093", "GGDA030404EG3", new Date(2004, 04, 04), "LOPR930609MMCSMS01");
                Persona persona19 = new Persona("Adrian", "Guti", "Robles", "6448989093", "GURA030404EG3", new Date(2004, 05, 8), "LOHU930609MMCSMS01");
                Persona persona20 = new Persona("Jose Angel", "Huerta", "Apara", "6448989093", "GURA030404EG3", new Date(2003, 04, 04), "LOPR930609MMCSMS01");

                Persona[] personas = new Persona[]{persona1, persona2, persona3, persona4, persona5, persona6, persona7, persona8, persona9, persona10, persona11, persona12, persona13, persona14, persona15, persona16, persona17, persona18, persona19, persona20};

                em.getTransaction().begin();
                for (Persona persona : personas) {
                    String telefonoEncriptado = encriptar(persona.getTelefono());
                    persona.setTelefono(telefonoEncriptado);
                    em.persist(persona);
                }
                em.getTransaction().commit();

                personasInsertadas = true;
            }
        } catch (Exception e) {
            em.getTransaction().rollback();
        }

        if (personasInsertadas) {
            JOptionPane.showMessageDialog(null, "Datos insertados correctamente en la base de datos.",
                    "Insersión de personas", JOptionPane.INFORMATION_MESSAGE);
        
        }
    }

    
    
    
    @Override
    public void insercion(){
         EntityManager em = emf.createEntityManager();
         EntityTransaction transaction = em.getTransaction();
         try {
            transaction.begin();

            // Generar datos falsos para inserción masiva
            List<Persona> personas = generarDatos();

            // Inserción masiva de registros
            for (Persona persona : personas) {
                em.persist(persona);
            }

            transaction.commit();
            System.out.println("Inserción masiva exitosa.");
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    }
    
    //auxiliar para crear las personas random
     private static List<Persona> generarDatos() {
        List<Persona> personas = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            Persona persona = new Persona();
            persona.setNombre("Nombre" + i);
            persona.setApellidoP("ApellidoP" + i);
            persona.setApellidoM("ApellidoM" + i);
            persona.setCurp("MAIS589647KLA" + i);
            persona.setTelefono("6442520352");
            persona.setFechaNacimiento( generateRandomDate());
            persona.setRfc("MAERT14"+i); // Edad entre 18 y 97 años

            personas.add(persona);
        }

        return personas;
    }
    
     private static Date generateRandomDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, randBetween(1970, 2004));
        calendar.set(Calendar.MONTH, randBetween(0, 11));
        calendar.set(Calendar.DAY_OF_MONTH, randBetween(1, 28)); // Para simplificar, asumimos que todos los meses tienen máximo 28 días
        return calendar.getTime();
    }

    // Método auxiliar para generar números aleatorios dentro de un rango
    private static int randBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }
    
}
