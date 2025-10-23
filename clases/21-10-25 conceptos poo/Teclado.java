public class Teclado {

private String color;
private String marca;
    private double tamaño;

   
    public Teclado(String c, String m, double t) {
        color = c;
        marca = m;
        tamaño = t;
    }

   
public void escribir() {
System.out.println("El teclado " + marca + "con tamaño" +tamaño + " de color " + color + " está siendo utilizado para escribir ");
    }

   
    }

