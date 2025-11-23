package main

func main() {
	// Estudiante
	e1 := NewEstudiante("Camila", 11)
	e1.MostrarInfo()

	// Libro
	l1 := NewLibro("El Principito")
	l1.MostrarLibro()

	// Persona
	p1 := NewPersona("Nicolás", 20)
	p1.Saludar()

	// Curso
	c1 := NewCurso()
	c1.InfoCurso()

	// Profesor
	pr1 := NewProfesor("Laura", "Matemáticas")
	pr1.MostrarProfesor()
}
