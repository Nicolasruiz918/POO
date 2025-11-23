public class EstudianteReal extends Estudiante {
    public EstudianteReal(String nombre, int grado) {
        super(nombre, grado);
    }

    public EstudianteReal(Estudiante otro) {
        super(otro);
    }

    @Override
    public void estudiar() {
        System.out.println(nombre + " está estudiando...");
    }
}