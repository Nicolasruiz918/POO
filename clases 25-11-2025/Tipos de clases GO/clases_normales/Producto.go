package main

type Producto struct {
	nombre string
	precio float64
}

func NewProducto(nombre string, precio float64) Producto {
	return Producto{
		nombre: nombre,
		precio: precio,
	}
}
