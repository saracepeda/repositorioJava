package funciones;
import java.util.Scanner;

public class Ej9Funciones {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Escribe un numero:");
		int num1= sc.nextInt();
		
		
		
		sc.close();

	}
	public static void divisoresPrimos(int num1) {
		for (int cont=2; cont <= num1; cont++) {
			int rest=num1 % cont;
			if (Ej7Funciones.esPrimo(cont)==true && rest == 0) {
				System.out.println(cont);
			}
		}
	}

}
