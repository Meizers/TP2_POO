package ar.edu.unlu.poo.turismo;
import java.util.*;

public class Paquete {
    private Destino destino;
    private Proveedor medioTransporte;
    private Proveedor hospedaje;
    private List<Proveedor> excursiones = new ArrayList<>();

    public Paquete(Destino destino, Proveedor medioTransporte, Proveedor hospedaje) {
        this.destino = destino;
        this.medioTransporte = medioTransporte;
        this.hospedaje = hospedaje;
    }

    public Destino getDestino() {
        return destino;
    }

    public Proveedor getMedioTransporte() {
        return medioTransporte;
    }

    public Proveedor getHospedaje() {
        return hospedaje;
    }

    public void agregarExcursion(Proveedor excursion) {
        excursiones.add(excursion);
    }

    public void Mostrar_Paquete(){
        System.out.println("destino : " + destino.getNombre());
        System.out.println("Provedor de transporte : " + medioTransporte.getNombre());
        System.out.println("Provedor de hospedaje : " + hospedaje.getNombre());;
        for (Proveedor provedor : excursiones){
            System.out.println("Excursion : " + provedor.getNombre());
        }
    }
}
