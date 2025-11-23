public class LibroReal : Libro
{
    public LibroReal(string titulo) : base(titulo) { }

    public override void Describir()
    {
        Console.WriteLine($"Libro: {Titulo} - {Autor}");
    }
}