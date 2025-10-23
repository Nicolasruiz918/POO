public class Bolso {

    private String color;
    private String marca;
    private String forma;

    public Bolso(String c, String m, String f) {
        color = c;
        marca = m;
        forma = f;
    }

    
    public void guardar() {
        System.out.println("El bolso de la marca " + marca +", color " + color +" y forma " + forma +" está guardando objetos.");
    }
}