import ICurso from '../interfaces/ICurso.js';

export default class Curso extends ICurso {
    constructor() {
        super();
        this.nombre = "sin nombre";
        this.duracion = 0;
    }

    infoCurso() {
        console.log(`Curso: ${this.nombre}, Duración: ${this.duracion} horas`);
    }
}