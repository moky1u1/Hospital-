public class Medico extends Persona{
    /*
    private String codMedico;
    private String nombre;
    private String apPat;
    private String apMat;
    private String dni;
    private int edad;
    private List<Servicio> servicios;
    private Hospital hospital;

    public Medico(String codMedico, String nombre, String apPat, String apMat, String dni, int edad, List<Servicio> servicios, Hospital hospital) {
        this.setCodMedico(codMedico);
        this.setNombre(nombre);
        this.setApPat(apPat);
        this.setApMat(apMat);
        this.setDni(dni);
        this.setEdad(edad);
        this.setServicios(servicios);
        this.setHospital(hospital);
    }

    public Medico(String codMedico, String nombre, String apPat, String apMat, String dni) {
        this.codMedico = codMedico;
        this.nombre = nombre;
        this.apPat = apPat;
        this.apMat = apMat;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Medico: " + nombre + " " + apPat + " " + apMat+ ", " + "Con Ci: " + dni;
    }

    public String getCodMedico() {
        return codMedico;
    }

    public void setCodMedico(String codMedico) {
        this.codMedico = codMedico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPat() {
        return apPat;
    }

    public void setApPat(String apPat) {
        this.apPat = apPat;
    }

    public String getApMat() {
        return apMat;
    }

    public void setApMat(String apMat) {
        this.apMat = apMat;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
     */
    protected String codMedico;

    public Medico(String nombre, String primerApellido, String segundoApellido, String dni, String codMedico) {
        super(nombre, primerApellido, segundoApellido, dni);
        this.setCodMedico(codMedico);
    }


    public String getCodMedico() {
        return codMedico;
    }

    public void setCodMedico(String codMedico) {
        this.codMedico = codMedico;
    }

    @Override
    public String toString() {
        return "Doctor/a: " + nombre + " " + primerApellido + " " + segundoApellido + ", Con el codigo: " + codMedico;
    }
}
