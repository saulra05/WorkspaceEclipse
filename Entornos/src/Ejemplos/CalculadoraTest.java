package Ejemplos;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculadoraTest {
	
	
    @Test
    public void testSumar() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.sumar(2, 3);
        assertEquals(5, resultado);
    }

    @Test
    public void testRestar() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.restar(5, 3);
        assertEquals(2, resultado);
    }
    
    @Test
    public void testPar() {
    	Calculadora calculadora = new Calculadora();
    	boolean resultado = calculadora.esPar(4);
    	assertTrue(resultado);
    }
    
    @Test
    public void testImpar() {
    	Calculadora calculadora = new Calculadora();
    	boolean resultado = calculadora.esImpar(7);
    	assertTrue(resultado);
    }
    
    
}
