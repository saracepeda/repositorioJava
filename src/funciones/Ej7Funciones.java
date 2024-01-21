package funciones;
import java.util.Scanner; 
public class Ej7Funciones {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x;
		System.out.println("Dime un numero:");
		x= sc.nextInt();
		if (esPrimo(x)==true) {
			System.out.println(x + "es primo");
		} else {
			System.out.println(x + "no es primo");
		}
		sc.close();
	}
public static boolean esPrimo (int x) {
	boolean primo = true;
	for (int y = 2; y < x && primo==true; y++) {
		if (x % y == 0) {
			primo = false;
		}
	}
	return (primo);
}
}
