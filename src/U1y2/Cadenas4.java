package U1y2;

import java.util.Scanner;

public class Cadenas4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Jugador 1, ingrese una contraseña");
		String contrasena = sc.next();

		System.out.println("Jugador 2, ingrese su intento");
		System.out.println("- El numero de caracteres es: " + contrasena.length());
		System.out.println("- La primera letra de la contrasena es: " + contrasena.charAt(0));
		System.out.println("- La ultima letra de la contrasena es: " + (contrasena.length() - 1));
		String intento = sc.next();
		while (!intento.equals(contrasena)) {
			System.out.println("- El numero de caracteres es: " + contrasena.length());
			System.out.println("- La primera letra de la contrasena es: " + contrasena.charAt(0));
			System.out.println("- La ultima letra de la contrasena es: " + (contrasena.length() - 1));
			System.out.println("Vuelve a intentarlo");
			if (contrasena.compareTo(intento)<0)
				System.out.println("Menor");
			intento = sc.next();
			
			

		}
		System.out.println("Lo lograste");
		
		if (contrasena.compareTo(intento)==0) {
			System.out.println("Acertaste");
		} 
		else {
			System.out.println("Mayor");
		}

		sc.close();

	}

}
