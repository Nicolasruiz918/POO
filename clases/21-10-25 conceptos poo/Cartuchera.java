public class Cartuchera {

    private String marca;
    private String color;
    private double tamaño;


    public Cartuchera(String m, String c, double t) {
        marca = m;
        color = c;
        tamaño = t;
    }


    public void guardar() {
        System.out.println("La cartuchera " + marca +" de color " + color +" y tamaño " + tamaño +" cm está guardando útiles escolares.");
    }


}
