package boletin1;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);   
		float num1;
		float num2;
		
		float resultado;
		System.out.println("Ingrese el primer numero");
		
		num1=sc.nextInt();
		
		System.out.println("Ingrese el segundo numero");
		num2=sc.nextInt();
		
	
		if (num2!=0) {
			System.out.println("El resultado de la division es:" +num1/num2);
			
			
		}
		else {
			System.out.println("Aviso: El numero ingresado es cero");
			
		
		}
		sc.close();
	}
	}
	
	