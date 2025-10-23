public class Tapabocas {

    private String tamaño;
    private String tipo;
    private String color;


    public Tapabocas(String t, String tp, String c) {
        tamaño = t;
        tipo = tp;
        color = c;
    }


    public void cubrir() {
        System.out.println("El tapabocas de tipo " + tipo + ", color " + color + " y tamaño " + tamaño + " está cubriendo el rostro.");
    }}
