public class Ciudad {
    /*
    private String codCiudad;
    private String nombre;

    public Ciudad(String codCiudad, String nombre) {
        this.setCodCiudad(codCiudad);
        this.setNombre(nombre);
    }

    @Override
    public String toString() {
        return "Ciudad: " + nombre;
    }

    public String getCodCiudad() {
        return codCiudad;
    }

    public void setCodCiudad(String codCiudad) {
        this.codCiudad = codCiudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     */
    protected String codCiudad;
    protected String nombreCiudad;

    public Ciudad(String nombreCiudad) {
        this.setNombreCiudad(nombreCiudad);
    }

    public String getCodCiudad() {
        return codCiudad;
    }

    public void setCodCiudad(String codCiudad) {
        this.codCiudad = codCiudad;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    @Override
    public String toString() {
        return "Ciudad:" + nombreCiudad;
    }
}
