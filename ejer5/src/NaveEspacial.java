public class NaveEspacial {
    private String nombre;
    private int combustible;
    private final int COMBUSTIBLE_MAXIMO = 100;

    // Constructor
    public NaveEspacial(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        this.combustible = combustibleInicial;
    }

    // Método para despegar
    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(nombre + " ha despegado.");
        } else {
            System.out.println(nombre + " no tiene suficiente combustible para despegar.");
        }
    }

    // Método para avanzar
    public void avanzar(int distancia) {
        if (combustible >= distancia) {
            combustible -= distancia;
            System.out.println(nombre + " ha avanzado " + distancia + " unidades.");
        } else {
            System.out.println(nombre + " no tiene suficiente combustible para avanzar " + distancia + " unidades.");
        }
    }

    // Método para recargar combustible
    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad > COMBUSTIBLE_MAXIMO) {
            combustible = COMBUSTIBLE_MAXIMO;
            System.out.println("Combustible recargado al máximo (" + COMBUSTIBLE_MAXIMO + ").");
        } else {
            combustible += cantidad;
            System.out.println("Combustible recargado en " + cantidad + " unidades.");
        }
    }

    // Método para mostrar el estado actual
    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + " | Combustible: " + combustible + "/" + COMBUSTIBLE_MAXIMO);
    }
}
