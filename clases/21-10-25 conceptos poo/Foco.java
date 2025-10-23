public class Foco {

    private String marca;
    private String color;
    private double tamaño;

    public Foco(String m, String c, double t) {
        marca = m;
        color = c;
        tamaño = t;
    }
    public void iluminar() {
        System.out.println("El foco " + marca + " de color " + color + " y tamaño " + tamaño + " cm está iluminando la habitación.");
    }
}