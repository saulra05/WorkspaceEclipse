package Tarea1;

public class Utils {
	
	public static void tipoTriangulo(double a, double b, double c) {
		esTriangulo(a, b, c);
		
		if(esTriangulo(a, b, c)) {
			if(a == b && b == c ) {
				System.out.print("Es un triangulo equilatero");
			}
			if(a == b && c != a || b == c && a != c || a == c && b != a) {
				System.out.print("Es un triágulo isósceles");
			}
			if(a != b && b != c && c != a) {
				System.out.print("Es un triángulo escaleno");
			}
		}else {
			System.out.print("Error, no se trata de un triangulo");
		}
		
	}
	
	public static boolean esTriangulo(double a, double b, double c) {
		if(a < 1 || b < 1 || c <1) {
			return false;
		}
	
		if(a + b<= c|| a + c <= b || b + c <= a) {
			return false;
		}
		return true;
		
	}
}