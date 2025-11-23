public class Libro {
    public String titulo;
    public  String autor;

    // Constructor sobrecargado (solo uno de los parámetros)
    public Libro(String titulo) {
        this.titulo = titulo;
        this.autor = "Desconocido";
    }
}
