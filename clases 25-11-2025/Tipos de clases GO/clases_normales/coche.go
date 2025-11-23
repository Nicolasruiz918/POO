package main

type Coche struct {
	marca  string
	modelo int
}

func NewCoche() Coche {
	return Coche{
		marca:  "Desconocida",
		modelo: 0,
	}
}
