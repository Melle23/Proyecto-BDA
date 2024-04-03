/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtos;


import java.time.LocalDate;



/**
 *
 * @author delll
 */
public class LicenciaDTO {
    String RFC;
    String tipo;
    String vigencia;
    Float costo;
    LocalDate FechaExpedicion;

    public LicenciaDTO(String RFC, String tipo, String vigencia, Float costo, LocalDate FechaExpedicion) {
        this.RFC = RFC;
        this.tipo = tipo;
        this.vigencia = vigencia;
        this.costo = costo;
        this.FechaExpedicion = FechaExpedicion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getVigencia() {
        return vigencia;
    }

    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }
    
    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }



    public Float getCosto() {
        return costo;
    }

    public void setCosto(Float costo) {
        this.costo = costo;
    }

    public LocalDate getFechaExpedicion() {
        return FechaExpedicion;
    }

    public void setFechaExpedicion(LocalDate FechaExpedicion) {
        this.FechaExpedicion = FechaExpedicion;
    }

//    public Float calcularCosto() {
//      
//     int anosVigencia;
//        //int añosVigencia = fechaExpedicion.until(fechaActual).getYears();
//        if(vigencia.equalsIgnoreCase("1")){
//             anosVigencia=1;
//        } else if (vigencia.equalsIgnoreCase("2")){
//            anosVigencia=2;
//        }else{
//            anosVigencia=3;
//        }
//        
//
//        if (this.tipo.equals("normal")) {
//            switch (anosVigencia) {
//                case 1:
//                    
//                     this.costo = 600f;
//                    break;
//                case 2:
//                    this.costo = 900f;
//                    break;
//                case 3:
//                    this.costo = 1100f;
//                    break;
//                default:
//                    throw new IllegalStateException("Vigencia de licencia no válida: " + anosVigencia);
//            }
//        } else if (this.tipo.equals("discapacitados")) {
//            switch (anosVigencia) {
//                case 1:
//                    this.costo = 200f;
//                    break;
//                case 2:
//                    this.costo = 500f;
//                    break;
//                case 3:
//                    this.costo = 700f;
//                    break;
//                default:
//                    throw new IllegalStateException("Vigencia de licencia no válida: " + anosVigencia);
//            }
//        } else {
//            throw new IllegalArgumentException("Tipo de licencia no válido: " + this.tipo);
//        }
//       return this.costo; 
//    }

   
    
}
