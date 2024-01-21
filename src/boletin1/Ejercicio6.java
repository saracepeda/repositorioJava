package boletin1;
import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1;
		int num2;
		int totalPositivos=0;
		 System.out.println("Dame dos numero");
		 int contador=0;
		 num1=sc.nextInt();
		 num2=sc.nextInt();
		  if (num1>0) {
			  contador++;
			  totalPositivos=contador;
			  
			  
		  }
			if (num2>0) {
				contador++;
				  totalPositivos=contador;
				System.out.println("El numero de positivos es:" +totalPositivos);
			}
		
		  
		sc.close();

	}

}
