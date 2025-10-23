public class Cargador {

private String color;
private String marca;
private double tamaño;
private String tipo;


public Cargador(String c, String m, double t, String ti) {
        
        color = c;
        marca = m;
        tamaño = t;
        tipo = ti;}

    void cargar() {
        System.out.println("El cargador " + marca +"  de color " +color +"  con el tamaño " +tamaño+" de tipo " + tipo + " está cargando");
    }

}
