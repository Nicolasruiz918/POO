public class Silla {

    private String color;
    private double tamaño;
    private String marca;
    private String forma;

 
    public Silla(String c, double t, String m, String f) {
        color = c;
        tamaño = t;
        marca = m;
        forma = f;
    }

    public void sentarse() {
        System.out.println("Te has sentado en una silla " + marca +" de color " + color + ", forma " + forma +" y tamaño " + tamaño + " cm.");
    }
}