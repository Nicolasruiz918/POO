public class Puerta {

    private double tamaño;
    private String color;
    private String marca;

    public Puerta(double t, String c, String m) {
        tamaño = t;
        color = c;
        marca = m;
    }


    public void cerrar() {
        System.out.println("La puerta de la marca " + marca +" con tamaño " + tamaño +" cm y color " + color +" se está cerrando.");
    }
}