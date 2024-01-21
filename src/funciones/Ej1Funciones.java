package funciones;

public class Ej1Funciones {

	public static void main(String[] args) {
		int i=0;
		
		eco(5,"Eco...");

	}
	public static void eco (int numeroVeces, String mensaje) {
		for (int i = 0; i < numeroVeces; i++) {
			System.out.println(mensaje);

		}
	}
	}
