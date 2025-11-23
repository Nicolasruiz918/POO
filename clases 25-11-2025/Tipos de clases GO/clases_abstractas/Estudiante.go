
package main

import "fmt"

type Estudiante interface {
	Estudiar()
}

type estudiante struct {
	Nombre string
	Grado  int
}

type EstudianteReal struct {
	estudiante
}

func NewEstudianteReal(nombre string, grado int) Estudiante { 
	return EstudianteReal{estudiante{nombre, grado}}
}

func NewEstudianteRealFromOtro(otro Estudiante) Estudiante { 
	e := otro.(EstudianteReal)
	return NewEstudianteReal(e.Nombre, e.Grado)
}

func (e EstudianteReal) Estudiar() {
	fmt.Printf("%s está estudiando...\n", e.Nombre)
}
