package ar.edu.unlu.poo.club;

public class Actividad {
    private String nombre;

    public Actividad(String nombre){
        this.nombre = nombre;
    }

    public String get_nombre(){
        return nombre;
    }

    public void mostrar_activ(){
        System.out.println("Nombre : " + nombre);
    }
}
