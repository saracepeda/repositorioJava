package funciones;

public class Ej5Funciones {

	public static void main(String[] args) {
		
		
		System.out.println(mayorTres(25,56,3));

	}
public static int mayorTres (int num1, int num2, int num3) {
	
	return Ej4Funciones.mayorDos (Ej4Funciones.mayorDos(num1, num2),num3);
}
}
