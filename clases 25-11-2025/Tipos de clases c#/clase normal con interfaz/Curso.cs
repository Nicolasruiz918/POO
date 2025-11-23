public class Curso : ICurso
{
    public string Nombre { get; set; } = "sin nombre";
    public int Duracion { get; set; } = 0;

    public Curso() { }

    public void InfoCurso()
    {
        Console.WriteLine($"Curso: {Nombre}, Duración: {Duracion} horas");
    }
}