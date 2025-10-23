public class Impresora {

    private String color;
    private double tamaño;
    private String marca;

  
    public Impresora(String c, double t, String m) {
        color = c;
        tamaño = t;
        marca = m;
    }
    public void imprimir() {
        System.out.println("La impresora de la marca " + marca + ", color " + color +   " y tamaño " + tamaño +" cm está imprimiendo documentos.");
    }
}