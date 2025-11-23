import Estudiante from './Clases/Estudiante.js';
import Libro from './Clases/Libro.js';
import Persona from './Clases/Persona.js';
import Curso from './Clases/Curso.js';
import Profesor from './Clases/Profesor.js';


// Estudiante
const e1 = new Estudiante("Camila", 11);
e1.mostrarInfo();

// Libro
const l1 = new Libro("El Principito");
l1.mostrarLibro();

// Persona
const p1 = new Persona("Nicolás", 20);
p1.saludar();


const c1 = new Curso();
c1.infoCurso();

// Profesor
const pr1 = new Profesor("Laura", "Matemáticas");
pr1.mostrarProfesor();