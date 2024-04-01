/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos;

import entidades.Licencia;
import entidades.Persona;

/**
 *
 * @author delll
 */
interface ILicenciasDAO {
   

  public void RegistrarLicencia(Licencia licencia);
  public Persona BuscarPersonaPoRFC(String rfc);


}
