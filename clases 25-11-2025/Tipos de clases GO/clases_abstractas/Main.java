public class Main {
    public static void main(String[] args) {
        Persona p1 = new PersonaReal("Nicolás", 20);
        Coche c1 = new CocheReal();
        Libro l1 = new LibroReal("El Principito");

        Estudiante eOriginal = new EstudianteReal("Camila", 11);
        Estudiante eCopia = new EstudianteReal(eOriginal);

        Producto pr1 = new ProductoReal("Chocolate", 5000);

        p1.mostrarInfo();
        c1.encender();
        l1.describir();
        eOriginal.estudiar();
        eCopia.estudiar();

        System.out.println("Producto: " + pr1.nombre + " - $" + pr1.precio);
        System.out.println("Descuento: $" + pr1.calcularDescuento());
    }
}