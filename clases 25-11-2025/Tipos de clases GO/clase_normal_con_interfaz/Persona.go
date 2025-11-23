package main

import "fmt"

type IPersona interface {
	Saludar()
}

type Persona struct {
	nombre string
	edad   int
}

func NewPersona(nombre string, edad int) IPersona {
	return Persona{nombre: nombre, edad: edad}
}

func (p Persona) Saludar() {
	fmt.Printf("Hola, soy %s y tengo %d años.\n", p.nombre, p.edad)
}
