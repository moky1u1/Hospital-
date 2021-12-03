import java.util.Date;

public class Persona {
    protected String nombre;
    protected String primerApellido;
    protected String segundoApellido;
    protected String dni;
    protected Date fechaNac;

    public Persona(String nombre, String primerApellido, String segundoApellido, String dni) {
        this.setNombre(nombre);
        this.setPrimerApellido(primerApellido);
        this.setSegundoApellido(segundoApellido);
        this.setDni(dni);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        String nombreCompleto = primerApellido;

        if (segundoApellido != null){
            nombreCompleto += " " + segundoApellido;
        }
        nombreCompleto += " " + nombre;

        return nombreCompleto;
    }
}
