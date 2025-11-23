class Program
{
    static void Main()
    {
        // Estudiante
        Estudiante e1 = new Estudiante("Camila", 11);
        e1.MostrarInfo();

        // Libro
        Libro l1 = new Libro("El Principito");
        l1.MostrarLibro();

        // Persona
        Persona p1 = new Persona("Nicolás", 20);
        p1.Saludar();

        // Curso
        Curso c1 = new Curso();
        c1.InfoCurso();

        // Profesor
        Profesor pr1 = new Profesor("Laura", "Matemáticas");
        pr1.MostrarProfesor();
    }
}