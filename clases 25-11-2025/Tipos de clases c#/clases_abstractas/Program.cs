class Program
{
    static void Main()
    {
        Persona p1 = new PersonaReal("Nicolás", 20);
        Coche c1 = new CocheReal();
        Libro l1 = new LibroReal("El Principito");

        EstudianteReal eOriginal = new EstudianteReal("Camila", 11);
        EstudianteReal eCopia = new EstudianteReal(eOriginal);

        ProductoReal pr1 = new ProductoReal("Chocolate", 5000);

        p1.MostrarInfo();
        c1.Encender();
        l1.Describir();
        eOriginal.Estudiar();
        eCopia.Estudiar();

        Console.WriteLine($"Producto: {pr1.Nombre} - ${pr1.Precio}");
        Console.WriteLine($"Descuento: ${pr1.CalcularDescuento()}");
    }
}