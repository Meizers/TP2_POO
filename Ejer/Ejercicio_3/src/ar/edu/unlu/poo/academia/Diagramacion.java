package ar.edu.unlu.poo.academia;
import java.util.*;

public class Diagramacion {
    private String diaHorario;
    private String nivel;
    private String disciplina;
    private Profesor profesor;
    private double precioPorAsistencia;
    private List<Alumno> alumnosInscritos;

    public Diagramacion(String diaHorario, String nivel, String disciplina, Profesor profesor, double precioPorAsistencia) {
        this.diaHorario = diaHorario;
        this.nivel = nivel;
        this.disciplina = disciplina;
        this.profesor = profesor;
        this.precioPorAsistencia = precioPorAsistencia;
        this.alumnosInscritos = new ArrayList<>();
    }

    public double calcularIngresos() {
        return precioPorAsistencia * alumnosInscritos.size();
    }

    public void registrarAsistencia(Alumno alumno) {
        alumnosInscritos.add(alumno);
    }

    public String getDisciplina() {
        return disciplina;
    }
}