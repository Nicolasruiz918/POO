package main

import "fmt"

type IProfesor interface {
	MostrarProfesor()
}

type Profesor struct {
	nombre  string
	materia string
}

func NewProfesor(nombre, materia string) IProfesor {
	return Profesor{nombre: nombre, materia: materia}
}

func (p Profesor) MostrarProfesor() {
	fmt.Printf("Profesor: %s, Materia: %s\n", p.nombre, p.materia)
}
