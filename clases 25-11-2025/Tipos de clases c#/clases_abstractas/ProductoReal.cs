public class ProductoReal : Producto
{
    public ProductoReal(string nombre, double precio) : base(nombre, precio) { }

    public override double CalcularDescuento()
    {
        return Precio * 0.10;
    }
}