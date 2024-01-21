package boletin1;
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int num1;
	 
	 System.out.println("Deme un numero");
	 num1= sc.nextInt();
	 if (num1>0) {
	 System.out.println("Es positivo");
	 sc.close();
	 }

	}
}