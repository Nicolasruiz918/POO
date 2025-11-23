public class Persona implements IPersona {
    public String nombre;
    public int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Constructor copia
    public Persona(Persona otra) {
        this.nombre = otra.nombre;
        this.edad = otra.edad;
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }
}
