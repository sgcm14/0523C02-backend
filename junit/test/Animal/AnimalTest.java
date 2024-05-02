package Animal;

import Animal.Animal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    @Test
    public void siElAnimalEsPesado(){
        Animal caballo = new Animal("caballo", "grande", 2001);
        Animal perro = new Animal("perro","mediano", 500);

        boolean esPesado = caballo.esPesado();
        boolean esPesado1 = perro.esPesado();

        assertEquals(true, caballo.esPesado());
        assertFalse(esPesado1);
    }
}