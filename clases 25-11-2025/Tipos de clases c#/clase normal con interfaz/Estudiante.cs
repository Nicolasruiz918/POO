public class Estudiante : IEstudiante
{
    public string Nombre { get; set; }
    public int Grado { get; set; }

    public Estudiante(string nombre, int grado)
    {
        Nombre = nombre;
        Grado = grado;
    }

    public void MostrarInfo()
    {
        Console.WriteLine($"Nombre: {Nombre}, Grado: {Grado}");
    }
}