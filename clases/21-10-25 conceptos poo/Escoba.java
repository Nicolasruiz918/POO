public class Escoba {

    private String color;
    private String marca;
    private double tamaño;

    
 Escoba(String c, String m, double t) {
        color = c;
        marca = m;
        tamaño = t;
    }

    
    public void barrer() {
        System.out.println("La escoba " + marca + " de color " + color + " y tamaño " + tamaño +" cm está barriendo el piso.");
    }

}