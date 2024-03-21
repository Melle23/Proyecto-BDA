package agenciafiscalpersistencia;

/**
 *
 * @author delll
 */
public enum EnumVigenciaLicencia {
    UN_ANIO(1),
    DOS_ANIOS(2),
    TRES_ANIOS(3);

    private final int anios;

    EnumVigenciaLicencia(int anios) {
        this.anios = anios;
    }

    public int getAnios() {
        return anios;
    }
}

