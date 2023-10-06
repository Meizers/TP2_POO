package ar.edu.unlu.poo.turismo;

public class Factura {
    private Cliente cliente;
    private Paquete paquete;
    private double monto;

    public Factura(Cliente cliente, Paquete paquete, double monto) {
        this.cliente = cliente;
        this.paquete = paquete;
        this.monto = monto;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getMonto() {
        return monto;
    }

    public void mostrar_factura(){
        System.out.println("Cliente : " + cliente.getNombre());
        paquete.Mostrar_Paquete();
        System.out.println("Monto : " + monto);
    }
}
