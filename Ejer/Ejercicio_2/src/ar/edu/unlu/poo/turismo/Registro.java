package ar.edu.unlu.poo.turismo;
import java.util.ArrayList;
import java.util.List;

public class Registro {
    private List<Proveedor> provedores = new ArrayList<>();
    private List<Destino> destinos = new ArrayList<>();
    private List<Paquete> paquetes = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();
    private List<Factura> facturas = new ArrayList<>();


    public void setProvedores(Proveedor provedor){
        provedores.add(provedor);
    }

    public Proveedor getProvedores(String nombre){
        for (Proveedor provedor : provedores){
            if (provedor.getNombre().equals(nombre)){
                return provedor;
            }
        }
        return null;
    }

    public void setPaquetes(Paquete paquete){
        paquetes.add(paquete);
    }

    public void setClientes(Cliente cliente){
        clientes.add(cliente);
    }

    public void setFacturas(Factura factura){
        facturas.add(factura);
    }

    public void setDestinos(Destino destino){
        destinos.add(destino);
    }

    public void VentasRealizadas(){
        int contador_max = -1;
        String destino_favorito = "";
        for (Destino destino : destinos){
            int contador = 0;
            System.out.println("Ventas realizadas en el destino " + destino.getNombre() + " :");
            for (Factura factura : facturas){
                if (factura.getPaquete().getDestino() == destino){
                    factura.mostrar_factura();
                    System.out.println("\n");
                    contador++;
                }
            }
            if (contador > contador_max){
                destino_favorito = destino.getNombre();
                contador_max = contador;
            }
            System.out.println("----------------------------------------");
        }

        System.out.println("Destino favorito : "+ destino_favorito);
    }


}
