public class Recogedor {

    private String marca;
    private String color;
    private double tamaño;
    
    public Recogedor(String m, String c, double t) {
        marca = m;
        color = c;
        tamaño = t;
    }
    public void recoger() {
        System.out.println("El recogedor " + marca +" de color " + color +" y tamaño " + tamaño +
        " cm está recogiendo la basura.");
    }
}