public class Lapicero {

    private String color;
    private double tamaño;
    private String marca;


    public Lapicero(String c, double t, String m) {
        color = c;
        tamaño = t;
        marca = m;
    }

    
    public void escribir() {
        System.out.println("El lapicero " + marca +" de color " + color + " y tamaño " + tamaño + " cm  se utilizo para escribir .");
    }
}