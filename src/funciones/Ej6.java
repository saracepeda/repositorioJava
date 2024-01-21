package funciones;

public class Ej6 {

	public static void main(String[] args) {
	char letra;
	if (esVocal(letra)== true) {
		System.out.println("La "+letra+ "es una vocal");
	} else {
		System.out.println(letra + "no es una vocal");
	}
	public static boolean esVocal (char letra) {
	boolean respuesta = false;
		if (letra=='a'||letra =='e'||letra=='i'||letra=='o'||letra=='u') {
			respuesta = true;
		System.out.println("El caracter introducido es una vocal:");
	}
		
	}
	
	
	return respuesta;
	
}
}
