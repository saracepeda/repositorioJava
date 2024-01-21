package U1y2;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un numero:");
		int num=sc.nextInt();
		if (num>=0) {
			System.out.println("Es positivo");
		} else {
			System.out.println("No es positivo");
		}
		sc.close();
	}

}
