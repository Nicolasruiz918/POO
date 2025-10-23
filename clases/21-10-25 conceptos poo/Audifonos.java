public class Audifonos {

    private double tamaño;
    private String forma;
    private String color;
    private String marca;

    public Audifonos(double t, String f, String c, String m) {
        tamaño = t;
        forma = f;
        color = c;
        marca = m;
    }
    public void escuchar() {
        System.out.println("Los audífonos de la marca " + marca +  ", color " + color + ", forma " + forma +" y tamaño " + tamaño +" cm están reproduciendo música.");
    }}
