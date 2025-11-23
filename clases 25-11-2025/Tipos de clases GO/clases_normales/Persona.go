package main

type Persona struct {
	nombre string
	edad   int
}

func NewPersona(nombre string, edad int) Persona {
	return Persona{
		nombre: nombre,
		edad:   edad,
	}
}
