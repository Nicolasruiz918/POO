public abstract class Estudiante {
    public String nombre;
    public int grado;

    public Estudiante(String nombre, int grado) {
        this.nombre = nombre;
        this.grado = grado;
    }

    public Estudiante(Estudiante otro) {
        this.nombre = otro.nombre;
        this.grado = otro.grado;
    }

    public abstract void estudiar();
}