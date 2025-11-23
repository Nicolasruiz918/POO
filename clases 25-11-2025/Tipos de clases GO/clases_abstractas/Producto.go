package main

type Producto interface {
	CalcularDescuento() float64
	Nombre() string
	Precio() float64
}

type ProductoReal struct {
	nombre string
	precio float64
}

func NewProductoReal(nombre string, precio float64) Producto {
	return &ProductoReal{nombre: nombre, precio: precio}
}

func (p *ProductoReal) CalcularDescuento() float64 {
	return p.precio * 0.10
}

func (p *ProductoReal) Nombre() string {
	return p.nombre
}

func (p *ProductoReal) Precio() float64 {
	return p.precio
}
