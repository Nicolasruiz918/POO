public abstract class Libro
{
    public string Titulo { get; set; }
    public string Autor { get; set; } = "Desconocido";

    protected Libro(string titulo)
    {
        Titulo = titulo;
    }

    public abstract void Describir();
}