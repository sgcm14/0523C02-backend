package disenio_flyweight.arbol;

public class Arbol {

    private int alto;
    private int ancho;
    private String color;
    private String tipoArbol;

    public Arbol(String tipoArbol) {
        this.tipoArbol = tipoArbol;
    }

    public Arbol(int alto, int ancho, String color, String tipoArbol) {
        this.alto = alto;
        this.ancho = ancho;
        this.color = color;
        this.tipoArbol = tipoArbol;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void mostrarInfoArbol(int x, int y){
        System.out.println("Arbol de tipo: " + tipoArbol);
        System.out.println("------------------------------------");
        System.out.println(" * Ubicado: (" + x + ";" + y + ")");
        System.out.println(" * Alto: " + alto);
        System.out.println(" * Horizontal: " + ancho);
        System.out.println(" * Color: " + color);
        System.out.println("------------------------------------");
    }
}
