package main

import "fmt"

type ILibro interface {
	MostrarLibro()
}

type Libro struct {
	titulo string
	autor  string
}

func NewLibro(titulo string) ILibro {
	return Libro{titulo: titulo, autor: "Desconocido"}
}

func (l Libro) MostrarLibro() {
	fmt.Printf("Título: %s, Autor: %s\n", l.titulo, l.autor)
}
