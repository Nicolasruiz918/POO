import Persona from './Persona.js';
import Coche from './coche.js';
import Libro from './Libro.js';
import Estudiante from './Estudiante.js';
import Producto from './Producto.js';

const p1 = new Persona("Nicolás", 20);
const c1 = new Coche();
const l1 = new Libro("El Principito");

const eOriginal = new Estudiante("Camila", 11);
const eCopia = new Estudiante(eOriginal); // constructor copia

const pr1 = new Producto("Teclado", 79.9);

console.log(`Persona: ${p1.nombre}, ${p1.edad}`);
console.log(`Coche: ${c1.marca}, ${c1.modelo}`);
console.log(`Libro: ${l1.titulo}, ${l1.autor}`);
console.log(`Estudiante original: ${eOriginal.nombre}, ${eOriginal.grado}`);
console.log(`Estudiante copia: ${eCopia.nombre}, ${eCopia.grado}`);
console.log(`Producto: ${pr1.nombre}, $${pr1.precio}`);