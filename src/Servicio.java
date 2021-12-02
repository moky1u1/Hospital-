import java.util.List;

public class Servicio {
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
}
