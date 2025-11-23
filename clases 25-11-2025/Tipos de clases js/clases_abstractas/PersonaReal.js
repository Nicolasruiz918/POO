import Persona from './Persona.js';

export default class PersonaReal extends Persona {
    constructor(nombre, edad) {
        super(nombre, edad);
    }

    mostrarInfo() {
        console.log(`Persona: ${this.nombre} (${this.edad})`);
    }
}