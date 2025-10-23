public class TomaCorriente {

    private double tamaño;
    private String tipo;
    private String color;
    private String forma;


    public TomaCorriente(double t, String tp, String c, String f) {
        tamaño = t;
        tipo = tp;
        color = c;
        forma = f;
    }

    public void conectar() {
        System.out.println("La toma corriente de tipo " + tipo + ", color " + color + ", forma " + forma +" y tamaño " + tamaño +" cm está conectando un dispositivo.");
    }
}