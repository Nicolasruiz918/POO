public abstract class Persona
{
    public string Nombre { get; set; }
    public int Edad { get; set; }

    protected Persona(string nombre, int edad)
    {
        Nombre = nombre;
        Edad = edad;
    }

    public abstract void MostrarInfo();
}