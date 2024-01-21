package boletin1;
import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1,num2,num3;
		
		int numMayor;
		 System.out.println("Ingrese el primer numero");
		 num1=sc.nextInt();
		if (num1>num2) {
			numMayor=num1;
		}
		System.out.println("Ingrese el segundo numero");
		num2=sc.nextInt();
		if (num2>num1) {
			numMayor=num2;
		}
		
		System.out.println("INgrese el tercer numero");
		num3=sc.nextInt();
		if (num3>num2) {
			numMayor=num3;
		}
		
		sc.close();

	}

}
