import IPersona from '../interfaces/IPersona.js';

export default class Persona extends IPersona {
    constructor(nombre, edad) {
        super();
        this.nombre = nombre;
        this.edad = edad;
    }

    static from(otraPersona) {
        return new Persona(otraPersona.nombre, otraPersona.edad);
    }

    saludar() {
        console.log(`Hola, soy ${this.nombre} y tengo ${this.edad} años.`);
    }
}