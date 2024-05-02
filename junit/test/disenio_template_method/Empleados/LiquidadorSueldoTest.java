package disenio_template_method.Empleados;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LiquidadorSueldoTest {

    //Debería emitir un documento en papel cuando es un empleado efectivo.
    @Test
    void liquidarSueldoEfectivo() {
        //DADO - GIVEN
        EmpleadoEfectivo empleadoEfectivo = new EmpleadoEfectivo("Martín", "Martini", "123456789", 400, 40, 60);
        LiquidadorSueldoEfectivo liquidadorSueldoEfectivo = new LiquidadorSueldoEfectivo();
        String MockResponse = "La liquidación generada es un documento impreso. Saldo a liquidar: 420.0";

        //CUANDO - WHEN
        String liquidacion = liquidadorSueldoEfectivo.liquidarSueldo(empleadoEfectivo);

        //ENTONCES - THEN
        Assertions.assertEquals(MockResponse, liquidacion);
    }

    @Test
    void depositarSueldoEfectivo() {
        //DADO - GIVEN
        EmpleadoEfectivo empleadoEfectivo = new EmpleadoEfectivo("Martín", "Martini", "123456789", 400, 40, 60);
        LiquidadorSueldoEfectivo liquidadorSueldoEfectivo = new LiquidadorSueldoEfectivo();
        String MockResponse = "La liquidación generada es un documento impreso.";

        //CUANDO - WHEN
        String imprimir = liquidadorSueldoEfectivo.imprimirSueldo(empleadoEfectivo);

        //ENTONCES - THEN
        Assertions.assertEquals(MockResponse, imprimir);
    }

    //Debería emitir un documento digital cuando es un empleado contratado.
    @Test
    void liquidarSueldoContratado() {
        //DADO - GIVEN
        EmpleadoContratado empleadoContratado = new EmpleadoContratado("Pompilia", "Pompini", "789456123", 120, 7);
        LiquidadorSueldoContratado liquidadorSueldoContratado = new LiquidadorSueldoContratado();
        String MockResponse = "La liquidación generada es un documento digital. Saldo a liquidar: 840.0";

        //CUANDO - WHEN
        String liquidacion = liquidadorSueldoContratado.liquidarSueldo(empleadoContratado);

        //ENTONCES - THEN
        Assertions.assertEquals(MockResponse, liquidacion);
    }

    @Test
    void depositarSueldoContratado() {
        //DADO - GIVEN
        EmpleadoContratado empleadoContratado = new EmpleadoContratado("Pompilia", "Pompini", "789456123", 120, 7);
        LiquidadorSueldoContratado liquidadorSueldoContratado = new LiquidadorSueldoContratado();
        String MockResponse = "La liquidación generada es un documento digital.";

        //CUANDO - WHEN
        String imprimir = liquidadorSueldoContratado.imprimirSueldo(empleadoContratado);

        //ENTONCES - THEN
        Assertions.assertEquals(MockResponse, imprimir);
    }

    //El liquidador debería arrojar un mensaje de error cuando no es posible calcular la liquidación.
    @Test
    void liquidarSueldoInvalid() {
        //DADO - GIVEN
        EmpleadoContratado empleadoContratado = new EmpleadoContratado("Pompilia", "Pompini", "789456123", 120, 7);
        LiquidadorSueldoEfectivo liquidadorSueldoEfectivo = new LiquidadorSueldoEfectivo();
        String MockResponse = "La liquidación no pudo ser calculada.";

        //CUANDO - WHEN
        String liquidacion = liquidadorSueldoEfectivo.liquidarSueldo(empleadoContratado);

        //ENTONCES - THEN
        Assertions.assertEquals(MockResponse, liquidacion);
    }
}