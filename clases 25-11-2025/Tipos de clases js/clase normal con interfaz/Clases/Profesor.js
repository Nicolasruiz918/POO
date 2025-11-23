import IProfesor from '../interfaces/IProfesor.js';

export default class Profesor extends IProfesor {
    constructor(nombre, materia) {
        super();
        this.nombre = nombre;
        this.materia = materia;
    }

    mostrarProfesor() {
        console.log(`Profesor: ${this.nombre}, Materia: ${this.materia}`);
    }
}