/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos;

import entidades.Automovil;
import entidades.Placa;

/**
 *
 * @author delll
 */
public interface IPlacasDAO {
    public void AgregarPlacasNuevas(Placa p,Automovil a);
    public void AgregarPlacasUsadas(Placa p);
    public Placa BuscarPlacas(String p);

}
