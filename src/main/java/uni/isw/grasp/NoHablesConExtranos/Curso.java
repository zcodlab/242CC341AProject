package uni.isw.grasp.NoHablesConExtranos;


import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private List<Estudiante> estudiantes;

    public Curso(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public void inscribirEstudiante(Estudiante estudiante) {
        if (!estudiantes.contains(estudiante)) {
            estudiantes.add(estudiante);
            estudiante.agregarCurso(this);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }
    
}
