// Coche.go
package main

import "fmt"

type Coche interface {
	Encender()
}

type coche struct {
	Marca  string
	Modelo int
}

type CocheReal struct {
	coche
}

func NewCocheReal() Coche {
	return CocheReal{coche{"Desconocida", 0}}
}

func (c CocheReal) Encender() {
	fmt.Println("El coche está encendido")
}
