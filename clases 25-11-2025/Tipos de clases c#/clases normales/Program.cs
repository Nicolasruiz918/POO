
using System;

class Program   
{
    static void Main(string[] args)
    {
        Persona p1 = new Persona("Nicolás", 20);
        Coche c1 = new Coche();
        Libro l1 = new Libro("El Principito");

        Estudiante eOriginal = new Estudiante("Camila", 11);
        Estudiante eCopia = new Estudiante(eOriginal);

        Producto pr1 = new Producto("Teclado", 79.9);

        Console.WriteLine($"Persona: {p1.Nombre}, {p1.Edad}");
        Console.WriteLine($"Coche: {c1.Marca}, {c1.Modelo}");
        Console.WriteLine($"Libro: {l1.Titulo}, {l1.Autor}");
        Console.WriteLine($"Estudiante original: {eOriginal.Nombre}, {eOriginal.Grado}");
        Console.WriteLine($"Estudiante copia: {eCopia.Nombre}, {eCopia.Grado}");
        Console.WriteLine($"Producto: {pr1.Nombre}, ${pr1.Precio}");
    }
}