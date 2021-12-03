public class Servicio extends Hospital{
    /*
    private String idServicio;
    private String nombre;
    private int numeroCamas;
    private String comentario;
    private List<Hospital> hospitales;

    public Servicio(String idServicio, String nombre, int numeroCamas, String comentario, List<Hospital> hospitales) {
        this.setIdServicio(idServicio);
        this.setNombre(nombre);
        this.setNumeroCamas(numeroCamas);
        this.setComentario(comentario);
        this.setHospitales(hospitales);
    }

    public Servicio(String idServicio, String nombre) {
        this.idServicio = idServicio;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Servicio: " + nombre;
    }

    public String getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(String idServicio) {
        this.idServicio = idServicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public List<Hospital> getHospitales() {
        return hospitales;
    }

    public void setHospitales(List<Hospital> hospitales) {
        this.hospitales = hospitales;
    }
     */
    protected String idServicio;
    protected String nombreServicio;
    protected int nroCamas;
    protected String comentario;

    public Servicio(String nombreCiudad, String codHospital, String nombreHospital, int telefono, String nombreServicio, int nroCamas) {
        super(nombreCiudad, codHospital, nombreHospital, telefono);
        this.setNombreServicio(nombreServicio);
        this.setNroCamas(nroCamas);
    }

    public String getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(String idServicio) {
        this.idServicio = idServicio;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public int getNroCamas() {
        return nroCamas;
    }

    public void setNroCamas(int nroCamas) {
        this.nroCamas = nroCamas;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "Servicio de: " + nombreServicio + ", realizado en el hospital: " + nombreHospital;
    }
}
