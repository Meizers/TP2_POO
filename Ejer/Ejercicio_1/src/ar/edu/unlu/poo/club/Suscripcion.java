package ar.edu.unlu.poo.club;
import java.util.ArrayList;

public class Suscripcion {
    private String tipo;
    private ArrayList<Actividad> lista = new ArrayList<>();

    public Suscripcion(String tipo){
        this.tipo = tipo;
    }

    public String get_tipo(){
        return tipo;
    }

    private void set_tipo(String tipo){
        this.tipo = tipo;
    }

    public void set_actividad(Actividad activ){
        lista.add(activ);
    }

    public void mostrar_actividades(){
        System.out.println("Actividades de la suscripcion " + tipo + " : ");
        for (Actividad activ : lista) {
            activ.mostrar_activ();
        }
    }

}
