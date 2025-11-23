public class Libro : ILibro
{
    public string Titulo { get; set; }
    public string Autor { get; set; } = "Desconocido";

    public Libro(string titulo)
    {
        Titulo = titulo;
    }

    public void MostrarLibro()
    {
        Console.WriteLine($"Título: {Titulo}, Autor: {Autor}");
    }
}