public class PersonaReal extends Persona {
    public PersonaReal(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Persona: " + nombre + " (" + edad + ")");
    }
}