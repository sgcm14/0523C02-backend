package disenio_flyweight.cancionero;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CancionFactoryTest {

    @Test
    public void testGetCancion_NuevaCancion() {
        CancionFactory factory = new CancionFactory();
        CancionDTO cancion = factory.getCancion("Shape of You");
        assertNotNull(cancion);
        assertEquals("Shape of You", cancion.getNombre());
    }

    @Test
    public void testGetCancion_CancionExistente() {
        CancionFactory factory = new CancionFactory();
        CancionDTO cancion1 = factory.getCancion("Shape of You");
        CancionDTO cancion2 = factory.getCancion("Shape of You");
        assertSame(cancion1, cancion2);
    }
}
