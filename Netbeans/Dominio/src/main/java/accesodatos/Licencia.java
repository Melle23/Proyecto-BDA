/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesodatos;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author molin
 */
@Entity
public class Licencia implements Serializable {
    
    @Id //Llave primaria de la entidad
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    
}
