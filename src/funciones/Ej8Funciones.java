package funciones;

import java.util.Scanner;

public class Ej8Funciones {

	public static void main(String[] args) {
		int num1;

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Dime un numero:");
			num1 = sc.nextInt();
			System.out.println((numeroDivisoresPrimos(num1)));
		}

	}

	public static int numeroDivisoresPrimos(int num1) {
		int contador = 0;
		for (int i = 2; i < num1; i++) {
			contador++;

		}
		return contador;

	}
}
