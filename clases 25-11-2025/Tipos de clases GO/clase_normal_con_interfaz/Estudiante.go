package main

import "fmt"

type IEstudiante interface {
	MostrarInfo()
}

type Estudiante struct {
	nombre string
	grado  int
}

func NewEstudiante(nombre string, grado int) IEstudiante {
	return Estudiante{nombre: nombre, grado: grado}
}

func (e Estudiante) MostrarInfo() {
	fmt.Printf("Nombre: %s, Grado: %d\n", e.nombre, e.grado)
}
