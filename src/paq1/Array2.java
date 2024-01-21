package paq1;
import java.lang.reflect.Array;
import java.util.Scanner;
public class Array2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca la cantidad de numeros que desee");
		int cantNumeros=0;
		cantNumeros=sc.nextInt();
		
		int []cifrasArray=new int[3];
			for(int i=0;i<cifrasArray.length;i++) {
				System.out.println("Introduzca las cifras" +i);
				cifrasArray [i]= sc.nextInt();
				
				
				
			}
		
		sc.close();

	}

}
