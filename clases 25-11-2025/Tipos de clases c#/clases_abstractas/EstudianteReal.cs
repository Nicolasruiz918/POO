public class EstudianteReal : Estudiante
{
    public EstudianteReal(string nombre, int grado) : base(nombre, grado) { }

    public EstudianteReal(EstudianteReal otro) : base(otro) { }

    public override void Estudiar()
    {
        Console.WriteLine($"{Nombre} está estudiando...");
    }
}