public class Estudiante
{
    public string Nombre { get; set; }
    public int Grado { get; set; }

    // Constructor normal
    public Estudiante(string nombre, int grado)
    {
        Nombre = nombre;
        Grado = grado;
    }

    // Constructor copia
    public Estudiante(Estudiante otro)
    {
        Nombre = otro.Nombre;
        Grado = otro.Grado;
    }
}