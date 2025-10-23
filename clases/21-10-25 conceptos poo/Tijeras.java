public class Tijeras {

    private String forma;
    private String color;
    private String marca;

    // Constructor
    public Tijeras(String f, String c, String m) {
        forma = f;
        color = c;
        marca = m;
    }

    // Método cortar
    public void cortar() {
        System.out.println("La tijera de la marca " + marca +
                           ", color " + color +
                           " y forma " + forma +
                           " está cortando papel.");
    }}