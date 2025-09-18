

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    Calculadora calc = new Calculadora();

    @Test
    void testSuma() {
        assertEquals(5, calc.sumar("2", "3"));
    }

    @Test
    void testDivision() {
        assertEquals(2, calc.dividir("10", "5"));
    }

    @Test
    void testDivisionPorCero() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> calc.dividir("10", "0"));
        assertEquals("No se puede dividir entre cero", ex.getMessage());
    }

    @Test
    void testSumaNegativa() {
        assertEquals(-10, calc.sumar("0", "-10"));
    }

    @Test
    void testRestarPositivos() {
        assertEquals(0, calc.restar("5", "5"));
    }

    @Test
    void testRestarNegativos() {
        assertEquals(-50, calc.restar("0", "50"));
    }

    @Test
    void testMultiplicar() {
        assertEquals(20, calc.multiplicar("2", "10"));
    }

    @Test
    void testMultiplicarNegativo() {
        assertEquals(-15, calc.multiplicar("3", "-5"));
    }

    @Test
    void testEntradaNoNumerica() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> calc.sumar("Esto es una prueba", "5"));
        assertTrue(ex.getMessage().contains("Esto no es un numero"));
    }

    @Test
    void testMultiplicarEntradaNoNumerica() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> calc.multiplicar("10", "?"));
        assertTrue(ex.getMessage().contains("Esto no es un numero"));
    }
}
