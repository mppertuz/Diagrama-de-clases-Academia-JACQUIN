

// Clase Estudiante
public class Estudiante {
    private int idEstudiante;
    private String nombre;
    private String correo;

    public Estudiante(int idEstudiante, String nombre, String correo) {
        this.idEstudiante = idEstudiante;
        this.nombre = nombre;
        this.correo = correo;
    }

    public void inscribirseCurso(Curso curso) {
        // lógica para inscripción
    }
}

// Clase Profesor
public class Profesor {
    private int idProfesor;
    private String nombre;
    private String especialidad;

    public Profesor(int idProfesor, String nombre, String especialidad) {
        this.idProfesor = idProfesor;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }
}

// Clase Curso
public class Curso {
    private int idCurso;
    private String nombre;
    private String horario;

    public Curso(int idCurso, String nombre, String horario) {
        this.idCurso = idCurso;
        this.nombre = nombre;
        this.horario = horario;
    }
}