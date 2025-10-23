public class Locker {

    private double tamaño;
    private String forma;
    private String color;
    
    public Locker(double t, String f, String c) {
        tamaño = t;
        forma = f;
        color = c;
    }

    public void guardar() {
        System.out.println("El locker de color " + color +", forma " + forma +" y tamaño " + tamaño + " cm está guardando objetos de forma segura.");
    }

}