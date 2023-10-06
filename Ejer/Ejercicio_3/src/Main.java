import ar.edu.unlu.poo.academia.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Academia academia = new Academia();

        Profesor profesor1 = new Profesor("Roberto", "rober@gmail.com");
        Profesor profesor2 = new Profesor("Manuelita", "manuelita@gmail.com");
        academia.agregarProfesor(profesor1);
        academia.agregarProfesor(profesor2);

        Diagramacion diagramacion1 = new Diagramacion("Lunes y Viernes 10:00 AM", "Inicial", "Tango", profesor1, 10.0);
        Diagramacion diagramacion2 = new Diagramacion("Martes y Sábados 5:00 PM", "Intermedio", "Tango", profesor2, 10.0);
        academia.agregarDiagramacion(diagramacion1);
        academia.agregarDiagramacion(diagramacion2);

        Alumno alumno1 = new Alumno("messi", "messi@gmail.com", "M10");
        Alumno alumno2 = new Alumno("maradona", "maradona@hotmail.com", "d10s");
        academia.agregarAlumno(alumno1);
        academia.agregarAlumno(alumno2);

        academia.registrarAsistencia(alumno1, diagramacion1);
        academia.registrarAsistencia(alumno1, diagramacion2);
        academia.registrarAsistencia(alumno2, diagramacion2);

        Map<String, Double> ingresosPorDisciplina = academia.calcularIngresosPorDisciplina();

        for (Map.Entry<String, Double> entry : ingresosPorDisciplina.entrySet()) {
            System.out.println("Disciplina: " + entry.getKey() + ", Ingresos: $" + entry.getValue());
        }
    }
}