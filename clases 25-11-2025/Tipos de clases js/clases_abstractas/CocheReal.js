import Coche from './Coche.js';

export default class CocheReal extends Coche {
    constructor() {
        super();
    }

    encender() {
        console.log("El coche está encendido");
    }
}