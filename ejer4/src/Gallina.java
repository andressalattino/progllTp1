public class Gallina {
    private String idGallina;
    private int edad;
    private int huevosPuestos;

    // Constructor
    public Gallina(String idGallina) {
        this.idGallina = idGallina;
        this.edad = 0;
        this.huevosPuestos = 0;
    }

    // Método para poner un huevo
    public void ponerHuevo() {
        huevosPuestos++;
    }

    // Método para envejecer
    public void envejecer() {
        edad++;
    }

    // Método para mostrar el estado de la gallina
    public void mostrarEstado() {
        System.out.println("ID: " + idGallina + " | Edad: " + edad + " | Huevos puestos: " + huevosPuestos);
    }
}

