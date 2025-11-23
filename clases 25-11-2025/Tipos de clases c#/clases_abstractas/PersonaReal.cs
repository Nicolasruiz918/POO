public class PersonaReal : Persona
{
    public PersonaReal(string nombre, int edad) : base(nombre, edad) { }

    public override void MostrarInfo()
    {
        Console.WriteLine($"Persona: {Nombre} ({Edad})");
    }
}