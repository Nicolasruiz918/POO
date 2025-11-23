public class Profesor : IProfesor
{
    public string Nombre { get; set; }
    public string Materia { get; set; }

    public Profesor(string nombre, string materia)
    {
        Nombre = nombre;
        Materia = materia;
    }

    public void MostrarProfesor()
    {
        Console.WriteLine($"Profesor: {Nombre}, Materia: {Materia}");
    }
}