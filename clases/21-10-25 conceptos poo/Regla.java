public class Regla {

    private double tamaño;
    private String color;
    private String marca;

    // Constructor
    public Regla(double t, String c, String m) {
        tamaño = t;
        color = c;
        marca = m;
    }

    // Método medir
    public void medir() {
        System.out.println("La regla de la marca " + marca + ", color " + color +" y tamaño " + tamaño +" cm está midiendo un objeto.");
    }}