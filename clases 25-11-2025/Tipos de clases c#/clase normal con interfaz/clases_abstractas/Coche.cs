public abstract class Coche
{
    public string Marca { get; set; } = "Desconocida";
    public int Modelo { get; set; } = 0;

    protected Coche() { }

    public abstract void Encender();
}