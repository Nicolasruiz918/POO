package main

import "fmt"

func main() {
	p1 := NewPersona("Nicolás", 20)
	c1 := NewCoche()
	l1 := NewLibro("El Principito")
	eOriginal := NewEstudiante("Camila", 11)
	eCopia := NewEstudianteCopia(eOriginal)
	pr1 := NewProducto("Teclado", 79.9)

	fmt.Printf("Persona: %s, %d\n", p1.nombre, p1.edad)
	fmt.Printf("Coche: %s, %d\n", c1.marca, c1.modelo)
	fmt.Printf("Libro: %s, %s\n", l1.titulo, l1.autor)
	fmt.Printf("Estudiante original: %s, %d\n", eOriginal.nombre, eOriginal.grado)
	fmt.Printf("Estudiante copia: %s, %d\n", eCopia.nombre, eCopia.grado)
	fmt.Printf("Producto: %s, $%.1f\n", pr1.nombre, pr1.precio)
}

//go mod init clases_normales
