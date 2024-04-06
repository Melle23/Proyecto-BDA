/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package consultas;


import dtos.LicenciaDTO;
import dtos.PlacasDTO;
import entidades.Placa;
import java.util.List;

/**
 *
 * @author delll
 */
public interface IConsultasPlacas {
    public void AgregarPlacasNuevas(PlacasDTO p);
    public void AgregarPlacasUsadas(PlacasDTO p);
    public Placa BuscarPlacas(String p);
    public List<PlacasDTO> listaPlacas(String rfc);
    
    
        
       
}
