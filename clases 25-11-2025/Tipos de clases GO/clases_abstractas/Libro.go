
package main

import "fmt"

type Libro interface {
	Describir()
}

type libro struct {
	Titulo string
	Autor  string
}

type LibroReal struct {
	libro
}

func NewLibroReal(titulo string) Libro { 
	return LibroReal{libro{titulo, "Desconocido"}}
}

func (l LibroReal) Describir() {
	fmt.Printf("Libro: %s - %s\n", l.Titulo, l.Autor)
}
