package disenio_flyweight.arbol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArbolTest {
    @Test
    public void testFlyweightUsoMemoria(){
        ArbolFactory factory = new ArbolFactory();
        Bosque bosque = new Bosque(factory);

        int cantArboles = 1000000;

        for (int i = 0; i < cantArboles/2; i++) {
            bosque.plantarArbol("Frutal",i,i);
        }

        for (int i = 0; i < cantArboles/2; i++) {
            bosque.plantarArbol("Ornamental",i,i);
        }

        Runtime runtime = Runtime.getRuntime();
        long memoriaUsada = (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024);

        System.out.println("Memoria usada: " + memoriaUsada + " MB");

        assertTrue(memoriaUsada < 100, "La memoria utilizada es excesiva.");
    }
}