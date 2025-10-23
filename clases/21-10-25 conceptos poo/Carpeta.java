public class Carpeta {
private String color;
private double tamaño;
private  String marca ; 

Carpeta (String c ,double t , String m){
    color =c ;
    tamaño = t ; 
    marca = m ;

}
public void  guardar () {
   System.err.println("La carpeta de la marca " + marca +", color " + color +" y tamaño " + tamaño +" cm está guardando documentos."); 
}
}