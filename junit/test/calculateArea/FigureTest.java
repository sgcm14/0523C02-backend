package calculateArea;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FigureTest {

    @Test
    void calculateCircle() {
        //DADO - GIVEN
        Figure circle = new Figure();

        //CUANDO - WHEN
        double result = circle.calculateArea("circulo", 5);

        //ENTONCES - THEN
        assertEquals(78.53981633974483, result);
    }

    @Test
    void calculateSquare() {
        //DADO - GIVEN
        Figure square = new Figure();

        //CUANDO - WHEN
        double result = square.calculateArea("cuadrado", 5);

        //ENTONCES - THEN
        assertEquals(25.0, result);
    }

    @Test
    void calculateSquareZero() {
        //DADO - GIVEN
        Figure square = new Figure();

        //CUANDO - WHEN
        double result = square.calculateArea("cuadrado", 0);

        //ENTONCES - THEN
        assertEquals(0.0, result);
    }

    @Test
    void calculateCircleZero() {
        //DADO - GIVEN
        Figure circle = new Figure();

        //CUANDO - WHEN
        double result = circle.calculateArea("circulo", 0);

        //ENTONCES - THEN
        assertEquals(0.0, result);
    }

    @Test
    void calculateTriangleZero() {
        //DADO - GIVEN
        Figure triangle = new Figure();

        //CUANDO - WHEN
        double result = triangle.calculateArea("triangulo", 0);

        //ENTONCES - THEN
        assertEquals(0.0, result);
    }

    @Test
    void calculateHexagon() {
        //DADO - GIVEN
        Figure hexagon = new Figure();

        //CUANDO - WHEN
        double result = hexagon.calculateArea("hexagono", 2);

        //ENTONCES - THEN
        assertEquals(0.0, result);
    }
}