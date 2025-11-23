package main

type Estudiante struct {
	nombre string
	grado  int
}

func NewEstudiante(nombre string, grado int) Estudiante {
	return Estudiante{
		nombre: nombre,
		grado:  grado,
	}
}

func NewEstudianteCopia(otro Estudiante) Estudiante {
	return Estudiante{
		nombre: otro.nombre,
		grado:  otro.grado,
	}
}
