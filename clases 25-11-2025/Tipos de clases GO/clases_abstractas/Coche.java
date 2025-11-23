public abstract class Coche {
    public String marca;
    public int modelo;

    public Coche() {
        this.marca = "Desconocida";
        this.modelo = 0;
    }

    public abstract void encender();
}