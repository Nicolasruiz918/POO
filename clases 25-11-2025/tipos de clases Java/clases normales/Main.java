public class Main {
    public static void main(String[] args) {

        Persona p1 = new Persona("Nicolás", 20);

       
        coche c1 = new coche();

    
        Libro l1 = new Libro("El Principito");

   
        Estudiante eOriginal = new Estudiante("Camila", 11);
        Estudiante eCopia = new Estudiante(eOriginal);

        Producto pr1 = new Producto("Teclado", 79.900);

        System.out.println("Persona: " + p1.nombre + ", " + p1.edad);
        System.out.println("Coche: " + c1.marca + ", " + c1.modelo);
        System.out.println("Libro: " + l1.titulo + ", " + l1.autor);
        System.out.println("Estudiante original: " + eOriginal.nombre + ", " + eOriginal.grado);
        System.out.println("Estudiante copia: " + eCopia.nombre + ", " + eCopia.grado);
        System.out.println("Producto: " + pr1.nombre + ", $" + pr1.precio);
    }
}
