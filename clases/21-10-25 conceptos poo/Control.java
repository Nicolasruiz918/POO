public class Control {

    private String color;
    private String marca;
    private double tamaño;

 
    public Control(String c, String m, double t) {
        color = c;
        marca = m;
        tamaño = t;
    }

  
    public void apagar() {
        System.out.println("El control de la marca " + marca + ", color " + color +" y tamaño " + tamaño +" cm está apagando el dispositivo.");
    }
}