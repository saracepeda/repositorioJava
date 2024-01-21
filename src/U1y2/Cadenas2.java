package U1y2;
import java.util.Scanner;
public class Cadenas2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		//solicitar al primer jugador que ingrese contraseña
		System.out.println("Jugador1 ingrese una contraseña");
		 
		String contrasena=sc.next();
		
		//jugador2 intenta adivinar la contraseña
		
		System.out.println("Jugador 2, intenta adivinar la contraseña.");
		System.out.println("- La contraseña tiene "+contrasena.length());
		System.out.println("- La primera letra es: "+contrasena.charAt(0));
		System.out.println("- LA ultima letrs es: "+(contrasena.length()-1));
		System.out.println("Ingresa tu intento");
		String intento=sc.next();
		 
		while (!intento.equals(contrasena)) {
			System.out.println("- La contraseña tiene "+contrasena.length());
			System.out.println("- La primera letra es: "+contrasena.charAt(0));
			System.out.println("- LA ultima letrs es: "+(contrasena.length()-1));
			System.out.println("Ingresa tu intento");
		    intento=sc.next();
			 
		}
		
		System.out.println("Lo lograste");
		
		
		sc.close();

	}

}
