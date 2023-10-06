import ar.edu.unlu.poo.turismo.*;

public class Main {
    public static void main(String[] args) {
        Proveedor provedor1 = new Proveedor("Aerolinias argentina","medio de transporte");
        Proveedor provedor2 = new Proveedor("trivago","hospedajes");
        Proveedor provedor3 = new Proveedor("Skugg Krigare","excursiones");
        Proveedor provedor4 = new Proveedor("atlantida","medio de transporte");
        Proveedor provedor5 = new Proveedor("hoteles buenardos","hospedajes");
        Proveedor provedor6 = new Proveedor("hoteles malardos","hospedajes");
        Proveedor provedor7 = new Proveedor("excursiones don pepe","excursiones");
        Proveedor provedor8 = new Proveedor("wine and ride","excursiones");
        Proveedor provedor9 = new Proveedor("salvando las distancias","excursiones");

        Destino destino1 = new Destino("jamaica");
        Destino destino2 = new Destino("egipto");
        Destino destino3 = new Destino("a la vuelta de mi casa");

        Paquete paquete1 = new Paquete(destino1,provedor1,provedor2);
        paquete1.agregarExcursion(provedor3);
        Paquete paquete2 = new Paquete(destino2,provedor1,provedor5);
        paquete2.agregarExcursion(provedor7);
        paquete2.agregarExcursion(provedor8);
        Paquete paquete3 = new Paquete(destino3,provedor4,provedor6);
        paquete3.agregarExcursion(provedor9);
        paquete3.agregarExcursion(provedor3);

        Cliente cliente1 = new Cliente("tomas resnik");
        Cliente cliente2 = new Cliente("caero");
        Cliente cliente3 = new Cliente("juan carlos");
        Cliente cliente4 = new Cliente("jesus");
        Cliente cliente5 = new Cliente("el papa de juan carlos");

        Factura factura1 = new Factura(cliente1,paquete1,10);
        Factura factura2 = new Factura(cliente1,paquete2,30);
        Factura factura3 = new Factura(cliente2,paquete1,10);
        Factura factura4 = new Factura(cliente3,paquete3,40);
        Factura factura5 = new Factura(cliente4,paquete1,10);
        Factura factura6 = new Factura(cliente5,paquete3,40);

        Registro registro = new Registro();
        registro.setProvedores(provedor1);
        registro.setProvedores(provedor2);
        registro.setProvedores(provedor3);
        registro.setProvedores(provedor4);
        registro.setProvedores(provedor5);
        registro.setProvedores(provedor6);
        registro.setProvedores(provedor7);
        registro.setProvedores(provedor8);
        registro.setProvedores(provedor9);

        registro.setDestinos(destino1);
        registro.setDestinos(destino2);
        registro.setDestinos(destino3);

        registro.setPaquetes(paquete1);
        registro.setPaquetes(paquete2);
        registro.setPaquetes(paquete3);

        registro.setClientes(cliente1);
        registro.setClientes(cliente2);
        registro.setClientes(cliente3);
        registro.setClientes(cliente4);
        registro.setClientes(cliente5);

        registro.setFacturas(factura1);
        registro.setFacturas(factura2);
        registro.setFacturas(factura3);
        registro.setFacturas(factura4);
        registro.setFacturas(factura5);
        registro.setFacturas(factura6);

        registro.VentasRealizadas();

    }
}