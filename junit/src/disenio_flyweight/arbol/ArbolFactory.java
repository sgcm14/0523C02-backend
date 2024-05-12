package disenio_flyweight.arbol;

import java.util.HashMap;

public class ArbolFactory {

    private static final HashMap<String, Arbol> arbolMap = new HashMap<>();

    public Arbol obtenerArbol(String tipoArbol){
        Arbol arbol = arbolMap.get(tipoArbol);
        if(arbol == null){
            arbol = new Arbol(tipoArbol);
            switch (tipoArbol) {
                case "Ornamental":
                    arbol = new Arbol(200, 400, "verde", "Ornamental");
                    break;
                case "Frutal":
                    arbol = new Arbol(500, 300, "rojo", "Frutal");
                    break;
                case "Floral":
                    arbol = new Arbol(100, 200, "celeste", "Floral");
                    break;
                default:
                    throw new IllegalArgumentException("Tipo de árbol desconocido: " + tipoArbol);
            }
            arbolMap.put(tipoArbol, arbol);
            System.out.println("************************************");
            System.out.println("Creo un arbol de tipo: " + tipoArbol);
            System.out.println("************************************");
        }
        return arbol;
    }
}
