public class Caja {

    private String color;
    private double tamaño;
    private String marca;

    public Caja(String c, double t, String m) {
        color = c;
        tamaño = t;
        marca = m;
    }

 
    public void guardar() {
        System.out.println("La caja " + marca + " de color " + color +" con tamaño " + tamaño + " cm está guardando un celular.");
    }

}