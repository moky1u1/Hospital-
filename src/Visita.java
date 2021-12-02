import java.util.Date;

public class Visita{
    private String codVisista;
    private Date fechaHoraVis;
    private Hospital hospital;
    private Servicio servicio;
    private Medico medico;
    private String dignostico;
    private String tratamientos;
    private int numCama;
    private Date fechaSalida;
    private Historial historial;

    public Visita(String codVisista, Date fechaHoraVis, Hospital hospital, Servicio servicio, Medico medico, String dignostico, String tratamientos, int numCama, Date fechaSalida, Historial historial) {
        this.setCodVisista(codVisista);
        this.setFechaHoraVis(fechaHoraVis);
        this.setHospital(hospital);
        this.setServicio(servicio);
        this.setMedico(medico);
        this.setDignostico(dignostico);
        this.setTratamientos(tratamientos);
        this.setNumCama(numCama);
        this.setFechaSalida(fechaSalida);
        this.setHistorial(historial);
    }

    public Visita(String codVisista, Date fechaHoraVis, int numCama) {
        this.codVisista = codVisista;
        this.fechaHoraVis = fechaHoraVis;
        this.numCama = numCama;
    }

    @Override
    public String toString() {
        return "Visita: " + codVisista + ", " + "Hora entrada: " + fechaHoraVis;
    }


    public String getCodVisista() {
        return codVisista;
    }

    public void setCodVisista(String codVisista) {
        this.codVisista = codVisista;
    }

    public Date getFechaHoraVis() {
        return fechaHoraVis;
    }

    public void setFechaHoraVis(Date fechaHoraVis) {
        this.fechaHoraVis = fechaHoraVis;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getDignostico() {
        return dignostico;
    }

    public void setDignostico(String dignostico) {
        this.dignostico = dignostico;
    }

    public String getTratamientos() {
        return tratamientos;
    }

    public void setTratamientos(String tratamientos) {
        this.tratamientos = tratamientos;
    }

    public int getNumCama() {
        return numCama;
    }

    public void setNumCama(int numCama) {
        this.numCama = numCama;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Historial getHistorial() {
        return historial;
    }

    public void setHistorial(Historial historial) {
        this.historial = historial;
    }
}
