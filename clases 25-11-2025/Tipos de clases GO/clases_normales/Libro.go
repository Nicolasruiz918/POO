package main

type Libro struct {
	titulo string
	autor  string
}

func NewLibro(titulo string) Libro {
	return Libro{
		titulo: titulo,
		autor:  "Desconocido",
	}
}
