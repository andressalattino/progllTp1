public class Libro {
    private String titulo;
    private String autor;
    private int anioDePublicacion;

public Libro(String titulo, String autor, int anioDePublicacion){
    this.titulo=titulo;
    this.autor=autor;
    this.anioDePublicacion=anioDePublicacion;
}

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getAnioDePublicacion() {
        return anioDePublicacion;
    }

    public void setAnioDePublicacion(int nuevoAnio) {
       if (nuevoAnio>=1900){
           this.anioDePublicacion = nuevoAnio;
       }else {
           System.out.println("año incorrecto");
       }
    }
}
