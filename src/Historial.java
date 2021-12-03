public class Historial extends Paciente{
    /*
    private String codHistorial;
    private Paciente paciente;

    public Historial(String codHistorial, Paciente paciente) {
        this.setCodHistorial(codHistorial);
        this.setPaciente(paciente);
    }

    public String getCodHistorial() {
        return codHistorial;
    }

    public void setCodHistorial(String codHistorial) {
        this.codHistorial = codHistorial;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Historial: " + codHistorial + ", Paciente: " + paciente.getNombre() + " " + paciente.getApPat() + " " + paciente.getApMat();
    }
     */
    protected String codHistorial;

    public Historial(String nombre, String primerApellido, String segundoApellido, String dni,String codPaciente,String nroSegSocial, String codHistorial){
        super(nombre, primerApellido, segundoApellido, dni, codPaciente, nroSegSocial);
        this.setCodHistorial(codHistorial);
    }

    public String getCodHistorial() {
        return codHistorial;
    }

    public void setCodHistorial(String codHistorial) {
        this.codHistorial = codHistorial;
    }

    @Override
    public String toString() {
        return "Registro de Historial: " + codHistorial + ", del paciente: " + nombre + " " + primerApellido + " " + segundoApellido
                + ", con el nro de seguro Social: " + nroSegSocial ;
    }

}
