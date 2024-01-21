package U1y2;


import java.util.Scanner;

public class cadenas {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		//Solicitar al usuario que ingrese la primera palabra
		System.out.println("Ingrese la primera palabra");
		String palabra1= sc.nextLine();
		
		//Solicitar al usuario la segunda palabra
		
		System.out.println("Ingrese la segunda palabra");
		String palabra2=sc.nextLine();
		
		if (palabra1.length()<palabra2.length()) {
			System.out.println("La palabra mas corta es: " + palabra1);
		} else if (palabra1.length()>palabra2.length()) {
			System.out.println("La palabra mas corta es: " +palabra2);
		}else {
			System.out.println("Ambas palabras tienen la misma longitud");
		}
		
		sc.close();

	}

}
