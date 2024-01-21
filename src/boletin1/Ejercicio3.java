package boletin1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca dos numeros");
	
		int num1;
		int num2;
		
		num1= sc.nextInt();
		num2= sc.nextInt();
		
		int resultado = num1*num2;
		
		System.out.println("El resultado de la multiplicacion es: " + resultado);
	
		
		sc.close();

	}

}
