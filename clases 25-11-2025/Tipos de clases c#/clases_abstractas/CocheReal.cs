public class CocheReal : Coche
{
    public CocheReal() : base() { }

    public override void Encender()
    {
        Console.WriteLine("El coche está encendido");
    }
}