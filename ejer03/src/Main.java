//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
      Libro libro=new Libro("percyJackson","rick", 1950 );
System.out.println("Autor: "+libro.getAutor());
System.out.println("Titulo: "+ libro.getTitulo());
System.out.println("Año de publicacion: "+libro.getAnioDePublicacion());
libro.setAnioDePublicacion(1850);
System.out.println(libro.getAnioDePublicacion());
libro.setAnioDePublicacion(1990);
System.out.println(libro.getAnioDePublicacion());

    }
}