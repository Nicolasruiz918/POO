public class Celular {

    private String marca;
    private double tamaño;
    private String color;

    public Celular(String m, double t, String c) {
        marca = m;
        tamaño = t;
        color = c;
    }

    public void investigar() {
        System.out.println("El celular " + marca + " de color " + color +" y tamaño " + tamaño + " pulgadas está investigando sobre el software");
    }

}