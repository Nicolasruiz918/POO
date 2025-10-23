public class Mouse {

    private String color;
    private double tamaño;
    private String marca;

 Mouse(String c, double t, String m) {
        color = c;
        tamaño = t;
        marca = m;
    }

    public void mover() {
        System.out.println("El mouse " + marca + " de color " + color +" con tamaño " + tamaño + " cm está moviéndose por la superficie.");
    }
   
}