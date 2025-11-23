import Estudiante from './Estudiante.js';

export default class EstudianteReal extends Estudiante {
    constructor(nombre, grado) {
        if (nombre instanceof Estudiante) {
            super(nombre.nombre, nombre.grado);
        } else {
            super(nombre, grado);
        }
    }

    estudiar() {
        console.log(`${this.nombre} está estudiando...`);
    }
}