import Producto from './Producto.js';  

export default class ProductoReal extends Producto {
    constructor(nombre, precio) {
        super(nombre, precio);
    }

    calcularDescuento() {
        return this.precio * 0.10;
    }
}