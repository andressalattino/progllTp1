public class Main {
    public static void main(String[] args) {
        // 1. Crear dos gallinas diferentes
        Gallina gallina1 = new Gallina("G001");
        Gallina gallina2 = new Gallina("G002");

        // 2. Cada gallina pone al menos un huevo
        gallina1.ponerHuevo();
        gallina2.ponerHuevo();
        gallina2.ponerHuevo(); // esta gallina pone otro más

        // 3. Cada gallina envejece un año
        gallina1.envejecer();
        gallina2.envejecer();

        // 4. Mostrar el estado de cada gallina
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
    }
}
