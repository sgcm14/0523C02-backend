package disenio_flyweight.arbol;

public class Bosque {

    private final ArbolFactory factory;

    public Bosque(ArbolFactory factory) {
        this.factory = factory;
    }

    public void plantarArbol(String tipoArbol, int x, int y){
        Arbol arbol = factory.obtenerArbol(tipoArbol);
        arbol.mostrarInfoArbol(x,y);
    }
}
