package ar.edu.unlu.poo.club;
import java.time.LocalDate;

public class Socio {
    private String nombre_apellido;
    private String dni;
    private int telefono;
    private String email;
    private Suscripcion suscripcion;
    private LocalDate fecha;

    public Socio(String nombre_apellido,String dni,int telefono,String email,Suscripcion suscripcion,LocalDate fecha){
        this.nombre_apellido = nombre_apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
        this.suscripcion = suscripcion;
        this.fecha = fecha;
    }

    public void setSuscripcion(Suscripcion suscripcion){
        this.suscripcion = suscripcion;
    }

    public Suscripcion getSuscripcion(){
        return suscripcion;
    }

    public void MostrarSocio(){
        System.out.println("Nombre : " + nombre_apellido);
        System.out.println("DNI : " + dni);
        System.out.println("Telefono : " + telefono);
        System.out.println("Email : " + email);
        System.out.println("Suscripcion : " + suscripcion.get_tipo());
    }

    public LocalDate getFecha(){
        return fecha;
    }

}
