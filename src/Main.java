import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args){
        Calendar calendario=Calendar.getInstance();
        calendario.set(Calendar.HOUR_OF_DAY, 3);
        final Date time = calendario.getTime();
        Estudiante jhamil = new Estudiante("JHAMIL","CONDORI","AGUILAR","13910474",calendario,"ZONA SUD",72236719,4345046,"condori.abdias.jhamil@gmail.com","Jhamil76","13910474a","14785963");
        Docente javier = new Docente("JAVIER","SANDER","","104789556",calendario,"SACABA KM5",60485742,4257893,"sander.javier@gmail.com","javier.io","145887ref",4300);
        Persona persona1=jhamil;
        Persona persona2=javier;
        Usuario usuario1=jhamil;
        Usuario usuario2=javier;

        System.out.println(jhamil.fechaNacimiento);

    }
}
