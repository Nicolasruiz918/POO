public class Libro
{
    public string Titulo { get; set; }
    public string Autor { get; set; }

    public Libro(string titulo)
    {
        Titulo = titulo;
        Autor = "Desconocido";
    }
}