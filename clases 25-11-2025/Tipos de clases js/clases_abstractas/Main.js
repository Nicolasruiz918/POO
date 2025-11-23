
import PersonaReal from './PersonaReal.js';
import CocheReal from './CocheReal.js';
import LibroReal from './LibroReal.js';
import EstudianteReal from './EstudianteReal.js';
import ProductoReal from './ProductoReal.js';

const p1 = new PersonaReal("Nicolás", 20);
const c1 = new CocheReal();
const l1 = new LibroReal("El Principito");

const eOriginal = new EstudianteReal("Camila", 11);
const eCopia = new EstudianteReal(eOriginal);

const pr1 = new ProductoReal("Chocolate", 5000);

p1.mostrarInfo();
c1.encender();
l1.describir();
eOriginal.estudiar();
eCopia.estudiar();

console.log(`Producto: ${pr1.nombre} - $${pr1.precio}`);
console.log(`Descuento: $${pr1.calcularDescuento()}`); 