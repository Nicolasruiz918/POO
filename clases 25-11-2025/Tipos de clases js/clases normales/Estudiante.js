class Estudiante {
    // Constructor normal
    constructor(nombre, grado) {
        // Si el segundo parámetro existe → constructor normal
        // Si solo llega un parámetro y es un objeto Estudiante → constructor copia
        if (grado !== undefined) {
            this.nombre = nombre;
            this.grado = grado;
        } else if (nombre instanceof Estudiante) {
            this.nombre = nombre.nombre;
            this.grado = nombre.grado;
        }
    }
}

export default Estudiante;