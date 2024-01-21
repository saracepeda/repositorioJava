package funciones;

public class Ej4Funciones {

	public static void main(String[] args) {
		
		System.out.println(mayorDos(9,3));

	}
	public static int mayorDos (int num1, int num2) {
		
		int res;
		
		if (num1>num2) {
			res=num1;
			
		}else { 
			res=num2;
			
		}
		return res;
	}
}
