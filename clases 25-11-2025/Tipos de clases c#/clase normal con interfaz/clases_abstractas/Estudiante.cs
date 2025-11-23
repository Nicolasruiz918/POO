public abstract class Estudiante
{
    public string Nombre { get; set; }
    public int Grado { get; set; }

    protected Estudiante(string nombre, int grado)
    {
        Nombre = nombre;
        Grado = grado;
    }

    // Constructor copia
    protected Estudiante(Estudiante otro)
    {
        Nombre = otro.Nombre;
        Grado = otro.Grado;
    }

    public abstract void Estudiar();
}