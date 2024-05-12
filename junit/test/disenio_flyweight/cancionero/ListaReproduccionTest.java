package disenio_flyweight.cancionero;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class ListaReproduccionTest {

    @Test
    public void testAgregarCancion() {
        CancionFactory factory = new CancionFactory();
        CancionDTO cancion1 = factory.getCancion("Shape of You");
        CancionDTO cancion2 = factory.getCancion("Someone Like You");

        ListaReproduccion lista = new ListaReproduccion("Mi Lista");
        lista.agregarCancion(cancion1);
        lista.agregarCancion(cancion2);

        assertEquals(2, lista.obtenerCanciones().size());
    }

    @Test
    public void testEliminarCancion() {
        CancionFactory factory = new CancionFactory();
        CancionDTO cancion1 = factory.getCancion("Shape of You");
        CancionDTO cancion2 = factory.getCancion("Someone Like You");

        ListaReproduccion lista = new ListaReproduccion("Mi Lista");
        lista.agregarCancion(cancion1);
        lista.agregarCancion(cancion2);

        lista.eliminarCancion(cancion1);
        assertEquals(1, lista.obtenerCanciones().size());
    }

}
