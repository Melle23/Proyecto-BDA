/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consultas;

import daos.IPlacasDAO;
import daos.PlacasDAO;
import dtos.LicenciaDTO;
import dtos.PlacasDTO;
import entidades.Automovil;
import entidades.EnumTipoLicencia;
import entidades.EnumVigenciaLicencia;
import entidades.Licencia;
import entidades.Persona;
import entidades.Placa;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author delll
 */
public class ConsultasPlacas implements IConsultasPlacas {

    IPlacasDAO placas;
    IConsultasLicencias rfc;
    Persona persona;

    public ConsultasPlacas() {
        placas = new PlacasDAO();
        rfc = new ConsultasLicencias();
    }

    @Override
    public void AgregarPlacasNuevas(PlacasDTO p) {
        if (rfc.BuscaPersonaPorRFC(p.getAuto().getRfc()) != null) {
            persona = rfc.BuscaPersonaPorRFC(p.getAuto().getRfc());
            Automovil auto = new Automovil(p.getAuto().getNumeroSerie(), p.getAuto().getMarca(), p.getAuto().getLinea(), p.getAuto().getColor(), p.getAuto().getModelo(), persona);
            Placa placa = new Placa(p.getNumeroPlacas(), p.getFechaEmision(), null, p.getCosto(), auto);
            placas.AgregarPlacasNuevas(placa, auto);
        } else {
            throw new IllegalArgumentException("El rfc que busca no existe");
        }
    }

    @Override
    public void AgregarPlacasUsadas(PlacasDTO p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void BuscarPlacas(String p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<PlacasDTO> listaPlacas(String rfc) {
        List<Placa> placa = placas.obtenerPlacasPorRfc(rfc); // Obtener placas desde la base de datos
        return convertirADTOsPlaca(placa);
    }

  

    private List<PlacasDTO> convertirADTOsPlaca(List<Placa> placas) {
        List<PlacasDTO> pDTO = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fechaFormateadaE="";
        String fechaFormateadaR="";
        for (Placa p : placas) {
            PlacasDTO placaDTO = new PlacasDTO();
            if(p.getFechaEmision()!=null){
             fechaFormateadaE = sdf.format(p.getFechaEmision());
            }
            if(p.getFechaRecepcion()!=null){
             fechaFormateadaR = sdf.format(p.getFechaRecepcion());
            }
         
            
            placaDTO.setNumeroPlacas(p.getNumeroPlacasAnt());
            placaDTO.setFechaE(fechaFormateadaE);
            placaDTO.setFechaR(fechaFormateadaR);
            placaDTO.setCosto(p.getCosto());
            placaDTO.setIdAuto(p.getAutomovil().getId());

            pDTO.add(placaDTO);
        }
        return pDTO;
    }

   
}
