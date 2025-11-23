
import IEstudiante from '../interfaces/IEstudiante.js';

export default class Estudiante extends IEstudiante {
    constructor(nombre, grado) {
        super();                 
        this.nombre = nombre;
        this.grado = grado;
    }

    mostrarInfo() {
        console.log(`Nombre: ${this.nombre}, Grado: ${this.grado}`);
    }
}