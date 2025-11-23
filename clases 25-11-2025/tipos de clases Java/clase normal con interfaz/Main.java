public class Main {
    public static void main(String[] args) {

        // Estudiante (usa la interfaz IEstudiante)
        Estudiante e1 = new Estudiante("Camila", 11);
        e1.mostrarInfo();

        // Libro
        Libro l1 = new Libro("El Principito");
        l1.mostrarLibro();

        // Persona
        Persona p1 = new Persona("Nicolás", 20);
        p1.saludar();

        // Coche
        Curso c1 = new Curso();
        c1.infoCurso();

        // Profesor (o Producto, según el ejercicio 5)
        Profesor pr1 = new Profesor("Laura", "Matemáticas");
        pr1.mostrarProfesor();
    }
}
