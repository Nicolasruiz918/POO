public class LibroReal extends Libro {
    public LibroReal(String titulo) {
        super(titulo);
    }

    @Override
    public void describir() {
        System.out.println("Libro: " + titulo + " - " + autor);
    }
}