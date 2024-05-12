package disenio_facade.cajero;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CajeroFacadeTest {

    @Test
    public void testRetirarDineroConSaldoSuficiente() {
        CajeroFacade cajeroFacade = new CajeroFacade();
        assertTrue(cajeroFacade.retirarDinero(12345678, "password", 500));
    }

    @Test
    public void testRetirarDineroConSaldoInsuficiente() {
        CajeroFacade cajeroFacade = new CajeroFacade();
        assertFalse(cajeroFacade.retirarDinero(12345678, "password", 1500));
    }

    @Test
    public void testRetirarDineroConAutenticacionFallida() {
        CajeroFacade cajeroFacade = new CajeroFacade();
        assertFalse(cajeroFacade.retirarDinero(87654321, "password", 500));
    }
}
