public class Cuaderno {

    private String color;
    private String marca;
    private double tamaño;

    public Cuaderno(String c, String m, double t) {
        color = c;
        marca = m;
        tamaño = t;
    }
    public void guardar() {
        System.out.println("El cuaderno " + marca + " de color " + color +" y tamaño " + tamaño +" cm está siendo guardado en la mochila.");
    }
}