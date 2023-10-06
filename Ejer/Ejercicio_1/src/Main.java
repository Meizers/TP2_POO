import ar.edu.unlu.poo.club.Suscripcion;
import ar.edu.unlu.poo.club.Socio;
import ar.edu.unlu.poo.club.Gestor;
import ar.edu.unlu.poo.club.Actividad;

import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LocalDate ayer = LocalDate.now().minusDays(1);
        LocalDate hace_60_dias = LocalDate.now().minusDays(60);
        LocalDate hace_14_dias = LocalDate.now().minusDays(14);
        LocalDate hace_140_dias = LocalDate.now().minusDays(140);

        Actividad actividad1 = new Actividad("Football");
        Actividad actividad2 = new Actividad("League of legends");
        Actividad actividad3 = new Actividad("Tenis");
        Actividad actividad4 = new Actividad("boxeo");
        Actividad actividad5 = new Actividad("Basquet");

        Suscripcion suscripcionBasica = new Suscripcion("basica");
        suscripcionBasica.set_actividad(actividad1);
        suscripcionBasica.set_actividad(actividad2);
        suscripcionBasica.mostrar_actividades();
        System.out.println("\n");
        Suscripcion suscripcionIntermedia = new Suscripcion("intermedia");
        suscripcionIntermedia.set_actividad(actividad1);
        suscripcionIntermedia.set_actividad(actividad2);
        suscripcionIntermedia.set_actividad(actividad3);
        suscripcionIntermedia.set_actividad(actividad4);
        suscripcionIntermedia.mostrar_actividades();
        System.out.println("\n");
        Suscripcion suscripcionDestacada = new Suscripcion("destacada");
        suscripcionDestacada.set_actividad(actividad1);
        suscripcionDestacada.set_actividad(actividad2);
        suscripcionDestacada.set_actividad(actividad3);
        suscripcionDestacada.set_actividad(actividad4);
        suscripcionDestacada.set_actividad(actividad5);
        suscripcionDestacada.mostrar_actividades();
        System.out.println("\n\n");

        Socio socio1 = new Socio("tomas resnik","44334503",123,"tomas.resnik@gmail.com",suscripcionDestacada,ayer);
        Socio socio2 = new Socio("roberto","11111111",3252,"roberto@gmail.com",suscripcionIntermedia,hace_60_dias);
        Socio socio3 = new Socio("messi","1010101010",10,"messi@gmail.com",suscripcionBasica,hace_14_dias);
        Socio socio4 = new Socio("cristiano ronaldo","77777777",7,"ronaldo@gmail.com",suscripcionIntermedia,hace_140_dias);

        Gestor club = new Gestor();
        club.setSocio(socio1);
        club.setSocio(socio2);
        club.setSocio(socio4);
        club.setSocio(socio3);

        club.reporte();
        club.MostrarListaSuscripcio();

    }
}