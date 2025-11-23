public class Estudiante {
     String nombre;
    int grado;

    // Constructor normal para crear el original (necesario)
    public Estudiante(String nombre, int grado) {
        this.nombre = nombre;
        this.grado = grado;
    }

    // Constructor copia
    public Estudiante(Estudiante otro) {
        this.nombre = otro.nombre;
        this.grado = otro.grado;
    }
}
