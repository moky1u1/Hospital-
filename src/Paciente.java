public class Paciente {
    private String codPaciente;
    private String nombre;
    private String apPat;
    private String apMat;
    private String dni;
    private int edad;
    private String numSegSocial;

    public Paciente(String codPaciente, String nombre, String apPat, String apMat, String dni, int edad, String numSegSocial) {
        this.setCodPaciente(codPaciente);
        this.setNombre(nombre);
        this.setApPat(apPat);
        this.setApMat(apMat);
        this.setDni(dni);
        this.setEdad(edad);
        this.setNumSegSocial(numSegSocial);
    }

    @Override
    public String toString() {
        return "Paciente: " + nombre + " " + apPat + " " + apMat  + ", Edad: "  + edad + ", Numero de seguro Social: " + numSegSocial;
    }

    public String getCodPaciente() {
        return codPaciente;
    }

    public void setCodPaciente(String codPaciente) {
        this.codPaciente = codPaciente;
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

    public String getNumSegSocial() {
        return numSegSocial;
    }

    public void setNumSegSocial(String numSegSocial) {
        this.numSegSocial = numSegSocial;
    }
}
