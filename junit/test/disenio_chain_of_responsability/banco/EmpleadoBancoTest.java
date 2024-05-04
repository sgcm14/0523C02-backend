package disenio_chain_of_responsability.banco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpleadoBancoTest {

    @Test
    void procesarSolicitud() {
        EmpleadoBanco empleado1 = new EjecutivoCuenta();
        EmpleadoBanco empleado2 = new Gerente();
        EmpleadoBanco empleado3 = new Director();


        empleado2.setSigEmpleadoBanco(empleado3);
        empleado1.setSigEmpleadoBanco(empleado2);

        empleado1.procesarSolicitud(78000);
    }

}