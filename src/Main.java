import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        //Medicos
        Medico juanPerez = new Medico("123","Juan", "Perez","Paredes","7654321");
        System.out.println(juanPerez);

        //Ciudades
        Ciudad cochabamba = new Ciudad("4","Cochabamba");

        //Servicios
        ArrayList<Servicio> servicios = new ArrayList<Servicio>();
        Servicio consulta1 = new Servicio("001","Consulta");
        Servicio consulta2 = new Servicio("002","Cirugia");
        Servicio consulta3 = new Servicio("003","Emergencia");

        servicios.add(consulta1);
        servicios.add(consulta2);
        servicios.add(consulta3);

        for (int i = 0; i < servicios.size(); i++) {
           // System.out.println(servicios.get(i).getNombre());
        }

        //Hospitales
        Hospital viedman = new Hospital("1","Viedman",412345);
        System.out.println(viedman);

        //Visistas
        Visita visita1 = new Visita("101", Calendar.getInstance().getTime(),50);
        System.out.println(visita1);

        //Paciente
        Paciente lalolamas = new Paciente("501","Lalo", "Lamas", "Tica","7891011",21,"1058046181A");
        System.out.println(lalolamas);


        //Historial
        Historial historial1 = new Historial("824",lalolamas);
        System.out.println(historial1);
         */
        //CIUDAD
        Ciudad cochabamba = new Ciudad("Cochabamba");

        //PACIENTE
        Paciente juanPerez = new Paciente("Juan","Perez", "Lopez","9871234","100","123456A");
        System.out.println(juanPerez);

        //HISTORIAL
        Historial historial1 = new Historial(juanPerez.nombre, juanPerez.primerApellido, juanPerez.segundoApellido, juanPerez.dni, juanPerez.codPaciente, juanPerez.nroSegSocial, "6158");
        System.out.println(historial1);

        //HOSPITAL
        Hospital norte = new Hospital(cochabamba.nombreCiudad,"7654", "Norte",4412345);
        System.out.println(norte);

        //SERVICIO
        Servicio cirujia = new Servicio(cochabamba.nombreCiudad, norte.codHospital,norte.nombreHospital,norte.telefono,"Cirujia",50);
        System.out.println(cirujia);

        //MEDICO
        Medico anaMartinez = new Medico("Ana", "Martinez","Rosales","7246847", "1024");
        System.out.println(anaMartinez);

        //VISITA
        Visita a1 = new Visita("Jose","Muñoz","Miranda","7954318", juanPerez.codPaciente, juanPerez.nroSegSocial, historial1.codHistorial,"818",Calendar.getInstance().getTime());
        System.out.println(a1);
    }
}
