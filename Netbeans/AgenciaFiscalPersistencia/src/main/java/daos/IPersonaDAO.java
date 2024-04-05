/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos;

import entidades.Persona;
import java.util.List;



/**
 *
 * @author delll
 */
public interface IPersonaDAO {
    
      public void RegistrarPersona(Persona persona);
      public List<Persona> obtenerPersonas();
}
