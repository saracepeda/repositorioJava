package U1y2;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduca el numero 12");
		int num;
		num=5;
		num	=sc.nextInt();
		if (num==12) {
			System.out.println("Es correcto");
			
		} else {
			System.out.println("No es correcto");
		}
		sc.close();
	}

}
