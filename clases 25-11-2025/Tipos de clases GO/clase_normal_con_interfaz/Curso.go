package main

import "fmt"

type ICurso interface {
	InfoCurso()
}

type Curso struct {
	nombre   string
	duracion int
}

func NewCurso() ICurso {
	return Curso{nombre: "sin nombre", duracion: 0}
}

func (c Curso) InfoCurso() {
	fmt.Printf("Curso: %s, Duración: %d horas\n", c.nombre, c.duracion)
}
