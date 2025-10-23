public class AireAcondicionado {

    private String marca;
    private double ancho;
    private double largo;
    private String color;
    public AireAcondicionado(String m, double a, double l, String c) {
        marca = m;
        ancho = a;
        largo = l;
        color = c;
    }
    public void enfriar() {
        System.out.println("El aire acondicionado " + marca + " de color " + color + ", con ancho de " + ancho + " cm y largo de " + largo +" cm está enfriando la habitación.");
    }
}