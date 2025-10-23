public class Computador {

    private String marca;
    private double tamaño;
    private String color;

    public Computador(String m, double t, String c) {
        marca = m;
        tamaño = t;
        color = c;
    }
    public void buscar() {
        System.out.println("El computador " + marca + " de color " + color + " y tamaño " + tamaño + " pulgadas está realizando una búsqueda en línea.");
    }
}