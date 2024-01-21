package U1y2;

public class NuevaPerspectiva {

	public static void main(String[] args) {
		
		int i= 0;

		eco(3, "Eco...");
		
		intervalo(1,6);
		
		System.out.println("El mayor de los dos es "+mayor(17,35));
		
		

	}

	public static void eco(int numeroVeces, String mensaje) {

		for (int i = 0; i < numeroVeces; i++) {
			System.out.println(mensaje);

		}
		

	}
	
	public static void  intervalo(int num1,int num2) {
		for (int i= (num1+1); i<num2;i++) {
			System.out.println(i);
			
		}
		
	}
	
	public static int mayor (int num1,int num2) {
		int res;
		if (num1>num2) {
			res=num1;
		} else { 
			res=num2;
		}
		//System.out.println(res);
		return res;
		
	
		}
	
	
	}
	
