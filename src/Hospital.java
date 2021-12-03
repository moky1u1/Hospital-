public class Hospital extends Ciudad {
    /*
    private String codHospital;
    private String nombre;
    private int telefono;
    private Ciudad ciudad;
    private List<Servicio> servicios;
    private Medico medico;

    public Hospital(String codHospital, String nombre, int telefono, Ciudad ciudad, List<Servicio> servicios, Medico medico) {
        this.setCodHospital(codHospital);
        this.setNombre(nombre);
        this.setTelefono(telefono);
        this.setCiudad(ciudad);
        this.setServicios(servicios);
        this.setMedico(medico);
    }

    public Hospital(String codHospital, String nombre, int telefono) {
        this.codHospital = codHospital;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Hospital: " + '\'' + nombre + ", " + " Telf: " + telefono + '\'';
    }

    public String getCodHospital() {
        return codHospital;
    }

    public void setCodHospital(String codHospital) {
        this.codHospital = codHospital;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
     */
    protected String codHospital;
    protected String nombreHospital;
    protected int telefono;

    public Hospital(String nombreCiudad, String codHospital, String nombreHospital, int telefono){
        super(nombreCiudad);
        this.setCodHospital(codHospital);
        this.setNombreHospital(nombreHospital);
        this.setTelefono(telefono);
    }


    public String getCodHospital() {
        return codHospital;
    }

    public void setCodHospital(String codHospital) {
        this.codHospital = codHospital;
    }

    public String getNombreHospital() {
        return nombreHospital;
    }

    public void setNombreHospital(String nombreHospital) {
        this.nombreHospital = nombreHospital;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    @Override
    public String toString() {
        return "Hospital: "  + nombreHospital + ", Ubicado en la ciudad de " + nombreCiudad + ", con el telf: " + telefono ;
    }
}
