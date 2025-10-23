public class Televisor {

 private double ancho;
 private double alto;
private String color;

  
public Televisor(double an, double al, String c) {
ancho = an;
alto = al;
color = c;
}

public void mostrar() {
System.out.println("El televisor está encendido");
System.out.println("Mostrando imagen en pantalla en resolución de " + ancho + "x" + alto + " píxeles.");
System.out.println("Color del televisor: " + color);
 }

}


