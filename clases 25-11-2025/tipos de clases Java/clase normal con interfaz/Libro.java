public class Libro implements ILibro {
    public String titulo;
    public String autor;

    // Constructor sobrecargado
    public Libro(String titulo) {
        this.titulo = titulo;
        this.autor = "Desconocido";
    }

    @Override
    public void mostrarLibro() {
        System.out.println("Título: " + titulo + ", Autor: " + autor);
    }
}
