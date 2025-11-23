public class Profesor implements IProfesor {
    public String nombre;
    public String materia;

    // Constructor con parámetros
    public Profesor(String nombre, String materia) {
        this.nombre = nombre;
        this.materia = materia;
    }

    @Override
    public void mostrarProfesor() {
        System.out.println("Profesor: " + nombre + ", Materia: " + materia);
    }
}
