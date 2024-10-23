package uni.isw.grasp.NoHablesConExtranos;

public class RegistrarEstudianteIU {
    private Estudiante estudiante;
    private Curso curso;
    public static void main(String[] args) {
        RegistrarEstudianteIU registroIU=new RegistrarEstudianteIU();
        registroIU.registrarEstudiante();
        registroIU.visualizarRegistro();
    }
    private void registrarEstudiante(){
        curso = new Curso("Ingeniería de Software");
        estudiante = new Estudiante("Juan");
        // Inscribimos al estudiante en el curso
        curso.inscribirEstudiante(estudiante);        
    }
    private void visualizarRegistro(){
        // Mostramos los resultados
        System.out.println("Curso: " + curso.getNombre());
        for (Estudiante estudiante : curso.getEstudiantes()) {
            System.out.println("Estudiante inscrito: " + estudiante.getNombre());
        }
    }
    
}
