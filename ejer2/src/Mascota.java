public class Mascota {
    private String nombre;
    private String raza;
    private double edad;
public Mascota(String nombre,String raza,double edad){
    this.nombre=nombre;
    this.raza=raza;
    this.edad=edad;
}
public void mostrarInfo () {
System.out.println(this.nombre+" "+this.raza+" "+this.edad );
}
public void cumplirAnio(double anio) {
    System.out.println("hoy es el cumpleaños de "+this.nombre);
this.edad=this.edad+anio;

}
}
