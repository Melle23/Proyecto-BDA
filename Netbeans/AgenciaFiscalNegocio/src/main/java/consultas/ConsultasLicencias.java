package consultas;

import daos.ILicenciasDAO;
import daos.LicenciasDAO;
import dtos.LicenciaDTO;
import entidades.Licencia;
import entidades.Persona;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author delll
 */
public class ConsultasLicencias implements IConsultasLicencias {
    ILicenciasDAO licencias;
    Persona persona;

    public ConsultasLicencias() {
        licencias=new LicenciasDAO();
    }
    
    @Override
    public void registroLicencia(LicenciaDTO l) {
        persona=BuscaPersonaPorRFC(l.getRFC());
         Licencia nuevaLicencia=new Licencia(l.getRFC(), persona,l.getTipo(),l.getVigencia(),l.getFechaExpedicion(),l.isActiva());
        System.out.println("consultaLicencias");
        licencias.RegistrarLicencia(nuevaLicencia);
    }

    @Override
    public Persona BuscaPersonaPorRFC(String rfc) {
        return licencias.BuscarPersonaPoRFC(rfc);
        
    }
    
      @Override
    public List<LicenciaDTO> listaLicencias(String rfc) {
    List<Licencia> lic = licencias.obtenerLicenciasPorRfc(rfc); // Obtener licencias desde la base de datos
        return convertirADTOsLicencia(lic);    
    }

    

    private List<LicenciaDTO> convertirADTOsLicencia(List<Licencia> licencias) {
        List<LicenciaDTO> lDTO = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        for (Licencia p : licencias) {
            LicenciaDTO licenciaDTO = new LicenciaDTO();
            String Fechavencimiento = sdf.format(p.getFechaVencimiento());


          licenciaDTO.setId(p.getId());
          licenciaDTO.setRFC(p.getRFC());
          licenciaDTO.setFv(Fechavencimiento);
          licenciaDTO.setVigencia(p.getVigencia());
          licenciaDTO.setTipo(p.getTipo());
          licenciaDTO.setActiva(p.isActiva());
          

            lDTO.add(licenciaDTO);
        }
        return lDTO;
    }

    @Override
    public Licencia obtenerEstadoLicencia(String rfc) {
        return  licencias.obtenerLicencia(rfc);
    }

    @Override
    public void actualizarLicencia(long idLicencia,Date nuevaFecha,boolean nuevoEstado) {
        licencias.actualizarPlacas(idLicencia,nuevaFecha,nuevoEstado);
    }
}

    

