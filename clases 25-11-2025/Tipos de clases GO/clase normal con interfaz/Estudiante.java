public class Estudiante implements IEstudiante {
    public String nombre;
    public int grado;

    // Constructor con parámetros
    public Estudiante(String nombre, int grado) {
        this.nombre = nombre;
        this.grado = grado;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Grado: " + grado);
    }
}
