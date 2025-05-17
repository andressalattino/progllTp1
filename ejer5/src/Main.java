public class Main {
    public static void main(String[] args) {
        // 2. Crear una nave con 50 unidades de combustible
        NaveEspacial nave1 = new NaveEspacial("ExplorerX", 50);

        // 3. Intentar avanzar 60 unidades (debe fallar)
        nave1.avanzar(60);

        // 4. Recargar 40 unidades
        nave1.recargarCombustible(40);

        // 5. Intentar avanzar 60 unidades nuevamente (ahora sí puede)
        nave1.avanzar(60);

        // 6. Mostrar el estado final
        nave1.mostrarEstado();
    }
}
