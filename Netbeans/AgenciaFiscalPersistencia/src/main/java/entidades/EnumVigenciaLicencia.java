package entidades;
/**
 *
 * @author delll
 */
public enum EnumVigenciaLicencia {
    UNO("uno", 1),
    DOS("dos", 2),
    TRES("tres", 3);
    
    

    private final String texto;
    private final int anio;

    private EnumVigenciaLicencia(String texto, int anio) {
        this.texto = texto;
        this.anio = anio;
    }

    /**
     * Obtiene el valor entero asociado al texto de la vigencia de la licencia.
     * 
     * @param texto el texto de la vigencia de la licencia
     * @return el valor entero asociado al texto
     * @throws IllegalArgumentException si el texto no es válido
     */
//    public static int obtenerEntero(String texto) {
//        System.out.println("cadena: " + texto);
//        for (EnumVigenciaLicencia valor : values()) {
//            System.out.println("valor enum: " + valor);
//            if (valor.texto.equalsIgnoreCase(texto)) {
//                return valor.anio;
//            }
//        }
//        throw new IllegalArgumentException("El texto no es válido: " + texto);
//    }

}
