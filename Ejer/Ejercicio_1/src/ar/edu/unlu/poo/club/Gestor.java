package ar.edu.unlu.poo.club;
import java.time.LocalDate;
import java.util.ArrayList;

public class Gestor {
    private ArrayList<Socio> lista_socio = new ArrayList<>();

    public void setSocio(Socio socio) {
        lista_socio.add(socio);
    }

    public void reporte(){
        LocalDate hace_un_mes = LocalDate.now().minusDays(30);
        System.out.println("Socios nuevos: \n");
        for (Socio socio : lista_socio) {
            if (socio.getFecha().isAfter(hace_un_mes)){
                socio.MostrarSocio();
                System.out.println("\n");
            }
        }
    }

    public void MostrarListaSuscripcio(){
        System.out.println("Socios con suscrpcion BASICA: \n");
        for (Socio socio : lista_socio) {
            if (socio.getSuscripcion().get_tipo().equals("basica")){
                socio.MostrarSocio();
                System.out.println("\n");
            }
        }
        System.out.println("\n");
        System.out.println("Socios con suscrpcion INTERMEDIA: \n");
        for (Socio socio : lista_socio) {
            if (socio.getSuscripcion().get_tipo().equals("intermedia")){
                socio.MostrarSocio();
                System.out.println("\n");
            }
        }
        System.out.println("\n");
        System.out.println("Socios con suscrpcion DESTACADA: \n");
        for (Socio socio : lista_socio) {
            if (socio.getSuscripcion().get_tipo().equals("destacada")){
                socio.MostrarSocio();
                System.out.println("\n");
            }
        }
    }
}
