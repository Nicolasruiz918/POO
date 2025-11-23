public abstract class Libro {
    public String titulo;
    public String autor;

    public Libro(String titulo) {
        this.titulo = titulo;
        this.autor = "Desconocido";
    }

    public abstract void describir();
}