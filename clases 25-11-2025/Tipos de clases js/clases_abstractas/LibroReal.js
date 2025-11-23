import Libro from './Libro.js';

export default class LibroReal extends Libro {
    constructor(titulo) {
        super(titulo);
    }

    describir() {
        console.log(`Libro: ${this.titulo} - ${this.autor}`);
    }
}