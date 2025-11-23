import ILibro from '../interfaces/ILibro.js';

export default class Libro extends ILibro {
    constructor(titulo) {
        super();
        this.titulo = titulo;
        this.autor = "Desconocido";
    }

    mostrarLibro() {
        console.log(`Título: ${this.titulo}, Autor: ${this.autor}`);
    }
}