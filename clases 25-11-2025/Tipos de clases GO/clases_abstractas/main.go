package main

import "fmt"

func main() {
	p1 := NewPersonaReal("Nicolás", 20)
	c1 := NewCocheReal()
	l1 := NewLibroReal("El Principito")

	eOriginal := NewEstudianteReal("Camila", 11)
	eCopia := NewEstudianteRealFromOtro(eOriginal)

	pr1 := NewProductoReal("Chocolate", 5000)

	p1.MostrarInfo()
	c1.Encender()
	l1.Describir()
	eOriginal.Estudiar()
	eCopia.Estudiar()

	
	fmt.Printf("Producto: %s - $%.0f\n", pr1.Nombre(), pr1.Precio())
	fmt.Printf("Descuento: $%.0f\n", pr1.CalcularDescuento())
}

//go mod init clases_Abstractas
