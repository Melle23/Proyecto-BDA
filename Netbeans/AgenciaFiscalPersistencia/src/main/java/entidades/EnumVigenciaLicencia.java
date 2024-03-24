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

    public static int obtenerEntero(String texto) {
        for (EnumVigenciaLicencia valor : values()) {
            if (valor.texto.equalsIgnoreCase(texto)) {
                return valor.anio;
            }
        }
        throw new IllegalArgumentException(" no es válido: " + texto);
    }

    
}

