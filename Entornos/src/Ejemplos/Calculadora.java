package Ejemplos;

public class Calculadora {
public int sumar(int a, int b) {
   return a + b;
}

public int restar(int a, int b) {
   return a - b;
}
//Método esPar/esImpar que obtiene un entero y devuelve un boolean


public boolean esPar(int num) {
	
	if (num % 2 == 0) {
		return true;
	}
	return false;
}

public boolean esImpar(int num) {
	
	if (num % 2 != 0) {
		return true;
	}
	return false;
}
}
