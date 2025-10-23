public class Mesa {

    private String color;
    private double alto;
    private double ancho;
    private String forma;

    
    public Mesa(String c, double a, double an, String f) {
        color = c;
        alto = a;
        ancho = an;
        forma = f;
    }

   
    public void colocar() {
        System.out.println("se coloco un objeto sobre la mesa de color " + color +   ", forma " + forma + ", con alto de " + alto +  " cm y ancho de " + ancho + " cm.");
    }

}