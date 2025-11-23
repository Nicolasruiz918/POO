public class ProductoReal extends Producto {
    public ProductoReal(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public double calcularDescuento() {
        return precio * 0.10;
    }
}