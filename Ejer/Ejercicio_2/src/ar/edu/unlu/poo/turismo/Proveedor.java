package ar.edu.unlu.poo.turismo;

public class Proveedor {
    private String nombre;
    private String clasificacion; // Medio de transporte, hospedaje o excursión

    public Proveedor(String nombre, String clasificacion) {
        this.nombre = nombre;
        this.clasificacion = clasificacion;
    }

    public String getNombre(){
        return nombre;
    }

    public String getClasificacion(){
        return clasificacion;
    }
}
