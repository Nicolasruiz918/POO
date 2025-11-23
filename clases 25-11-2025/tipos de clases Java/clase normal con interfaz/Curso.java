public class Curso implements ICurso {
    public String nombre;
    public int duracion;

    // Constructor sin parámetros
    public Curso() {
        this.nombre = "sin nombre";
        this.duracion = 0 ;
    }

    @Override
    public void infoCurso() {
        System.out.println("Curso: " + nombre + ", Duración: " + duracion + " horas");
    }
}
