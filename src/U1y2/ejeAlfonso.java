package U1y2;

import java.util.Scanner;

public class ejeAlfonso {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		char primeraletra;
		String textunidad;
		String nombreDepto;
		int numProfesores;

		int maxNumProfesores=0; 
		String nombDeptoMaxNumProfesores= ""; 
		String deptMenorMediaAnyosAntig= ""; 
		float menorMediaAntig= 41; 
		
		textunidad="no es fin";
		while (!textunidad.equals("fin"))
		{
			System.out.println("Introduzca una unidad: ");
			textunidad= sc.next();
			if(!textunidad.equals("fin")) {
				primeraletra=textunidad.charAt(0);
				if(primeraletra=='D') {
					System.out.println("Nombre del departamento: ");
					nombreDepto= sc.next();
					System.out.println("Numero de profesores del departamento: ");
					numProfesores=sc.nextInt();
					if(numProfesores>maxNumProfesores) {
						maxNumProfesores=numProfesores; 
						nombDeptoMaxNumProfesores=nombreDepto; 
					}
					float sumaAntAnyos=0; 
					for(int i=1; i<=numProfesores; i++) {
						System.out.println("Nombre del profesor: ");
						String nombreProfesor= sc.next();
						System.out.println("Anyos de antiguedad: ");
						int anyosAntig= sc.nextInt();
						while (anyosAntig<40) {
							System.out.println("Hay un error, vuelve a poner el anyo de antiguedad: ");
							anyosAntig= sc.nextInt();							
						}
						sumaAntAnyos=sumaAntAnyos+anyosAntig; 
					}
					float mediaAnyoAntig=sumaAntAnyos/numProfesores; 
					if(mediaAnyoAntig<menorMediaAntig) {
						menorMediaAntig=mediaAnyoAntig;
						deptMenorMediaAnyosAntig=nombreDepto; 
					}
				}
				if(primeraletra=='C') {
					System.out.println("Soy una clase");
				}
				System.out.println(primeraletra);
				
			}
		}
			sc.close();
			System.out.println("hola soy yo");
			System.out.println("El departemento con mayor numero de profesores es: "+nombDeptoMaxNumProfesores);
			System.out.println("El depto con menor media de antiguedad de los profesores es: ");
			System.out.println(deptMenorMediaAnyosAntig);
			
	}

}
