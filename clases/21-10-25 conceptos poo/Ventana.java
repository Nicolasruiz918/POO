public class Ventana {

    private String color;
    private String forma;
    private String marca;

    // Constructor
    public Ventana(String c, String f, String m) {
        color = c;
        forma = f;
        marca = m;
    }

    // Método abrir
    public void abrir() {
        System.out.println("La ventana de la marca " + marca +", color " + color +" y forma " + forma +" se está abriendo.");
    }
}