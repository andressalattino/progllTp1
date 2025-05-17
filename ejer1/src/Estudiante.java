public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    public void mostrarInfo() {
        System.out.println(apellido + ", " + nombre + " - Curso: " + curso + " - Calificación: " + calificacion);
    }

    public void subirCalificacion(double puntos) {
        if (calificacion + puntos > 10) {
            calificacion = 10;
        } else {
            calificacion += puntos;
        }
    }

    public void bajarCalificacion(double puntos) {
        if (calificacion - puntos < 0) {
            calificacion = 0;
        } else {
            calificacion -= puntos;
        }
    }
}
