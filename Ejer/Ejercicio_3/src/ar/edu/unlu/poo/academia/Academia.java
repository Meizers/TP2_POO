package ar.edu.unlu.poo.academia;
import java.util.*;

public class Academia {
    private List<Diagramacion> diagramaciones;
    private List<Alumno> alumnos;
    private List<Profesor> profesores;

    public Academia() {
        diagramaciones = new ArrayList<>();
        alumnos = new ArrayList<>();
        profesores = new ArrayList<>();
    }

    public void agregarDiagramacion(Diagramacion diagramacion) {
        diagramaciones.add(diagramacion);
    }

    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public void registrarAsistencia(Alumno alumno, Diagramacion diagramacion) {
        // En este punto, puedes registrar la asistencia del alumno a la diagramación
        diagramacion.registrarAsistencia(alumno);
    }

    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public Map<String, Double> calcularIngresosPorDisciplina() {
        Map<String, Double> ingresosPorDisciplina = new HashMap<>();

        for (Diagramacion diagramacion : diagramaciones) {
            String disciplina = diagramacion.getDisciplina();
            double ingreso = diagramacion.calcularIngresos();

            if (ingresosPorDisciplina.containsKey(disciplina)) {
                ingresosPorDisciplina.put(disciplina, ingresosPorDisciplina.get(disciplina) + ingreso);
            } else {
                ingresosPorDisciplina.put(disciplina, ingreso);
            }
        }

        return ingresosPorDisciplina;
    }
}
