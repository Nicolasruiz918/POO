// persona.go
package main

import "fmt"

type Persona interface {
	MostrarInfo()
}

type persona struct {
	Nombre string
	Edad   int
}

type PersonaReal struct {
	persona
}

func NewPersonaReal(nombre string, edad int) Persona {
	return PersonaReal{persona{nombre, edad}}
}

func (p PersonaReal) MostrarInfo() {
	fmt.Printf("Persona: %s (%d)\n", p.Nombre, p.Edad)
}
