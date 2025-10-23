public class Block {

    private String tamaño;
    private String tipo;
    private String color;
    private String marca;

   
    public Block(String t, String tp, String c, String m) {
        tamaño = t;
        tipo = tp;
        color = c;
        marca = m;
    }


    public void mostrar() {
        System.out.println("El block de tamaño " + tamaño + ", tipo " + tipo + ", color " + color + " y marca " + marca + " está siendo mostrado.");
    }
}