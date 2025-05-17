//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Lucas", "Gómez", "Programación I", 7.5);

        estudiante.mostrarInfo();

        estudiante.subirCalificacion(2);
        estudiante.mostrarInfo();

        estudiante.bajarCalificacion(5);
        estudiante.mostrarInfo();

        estudiante.subirCalificacion(10); // intenta pasar de 10
        estudiante.mostrarInfo();
    }
}
