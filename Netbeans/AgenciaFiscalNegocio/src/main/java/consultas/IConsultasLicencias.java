/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package consultas;

import dtos.LicenciaDTO;
import entidades.Persona;

/**
 *
 * @author delll
 */
public interface IConsultasLicencias {
    public void registroLicencia(LicenciaDTO l);
    public Persona  BuscaPersonaPorRFC(String rfc);
    
}
