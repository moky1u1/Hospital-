import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main {
    public static void main(String[] args) {
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


    }
}
