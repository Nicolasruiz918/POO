public class Hoja {

    private String tamaño;
    private String color;
    private String tipo;

    // Constructor
    public Hoja(String t, String c, String tp) {
        tamaño = t;
        color = c;
        tipo = tp;
    }

    // Método mostrar
    public void mostrar() {
        System.out.println("La hoja de tamaño " + tamaño + ", color " + color + " y tipo " + tipo +" está siendo mostrada.");
    }}