import java.util.List;

public class Hospital {
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
}
