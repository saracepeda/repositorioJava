package boletin1;
import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1;
		System.out.println("Dame un numero");
		
		num1 =sc.nextInt();
		
		if (num1>0) {
			System.out.println("Es positivo");
		}
		 if (num1<0) {
			 System.out.println("Es negativo");
		 }
		if (num1==0) {
			System.out.println("El numero es igual a cero");
		}
		
		sc.close();

	}

}
