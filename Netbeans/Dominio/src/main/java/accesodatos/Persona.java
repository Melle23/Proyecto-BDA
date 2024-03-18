package accesodatos;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author delll
 */
@Entity //Especifica la creacion de la entidad
public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
     @Column (name="RFC",nullable = false,length =13)
    private String RFC;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

       
}
