package disenio_template_method.Menu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenuTest {
    @Test
    void prepararMenuInfantil() {
        //DADO - GIVEN
        MenuInfantil menuInfantil = new MenuInfantil(50,2);
        Empleado empleado = new Empleado();
        double MockResponse = 56;

        //CUANDO - WHEN
        empleado.prepararMenu(menuInfantil);
        double precioFinal = menuInfantil.calcularCosto();


        //ENTONCES - THEN
        assertEquals(MockResponse, precioFinal);
    }

    @Test
    void prepararMenuClasico() {
        //DADO - GIVEN
        MenuClasico menuClasico = new MenuClasico(60);
        Empleado empleado = new Empleado();
        double MockResponse = 60;

        //CUANDO - WHEN
        empleado.prepararMenu(menuClasico);
        double precioFinal = menuClasico.calcularCosto();


        //ENTONCES - THEN
        assertEquals(MockResponse, precioFinal);
    }

    @Test
    void prepararMenuVegetariano() {
        //DADO - GIVEN
        MenuVegetariano menuVegetariano = new MenuVegetariano(40,3,2);
        Empleado empleado = new Empleado();
        double MockResponse = 44.01;

        //CUANDO - WHEN
        empleado.prepararMenu(menuVegetariano);
        double precioFinal = menuVegetariano.calcularCosto();


        //ENTONCES - THEN
        assertEquals(MockResponse, precioFinal);
    }
}