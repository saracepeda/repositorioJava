package U1y2;

import java.util.Scanner;

public class examenTrimestre {
	 
	public static void main(String[] args) {
	
		Scanner sc=new Scanner (System.in);	
		
		String nombreMes;
		String estadoCieloDia;
		String estadoCieloDiaMasHumedad= "";
		String nublado;
		
		int cantDiasDatos;
		int numDiaMes= 0;
		int humedadDia;
		int velocidadVientoDia;
		
		int contadorDias; 
		int mesMenorNublado= Integer.MAX_VALUE; 
		int mayorDiaHumedad= Integer.MIN_VALUE;
		
		float tempMediaDia;
		
		System.out.println("Intoduzca nombre del mes: ");
		nombreMes= sc.next();
			while (!nombreMes.equals("ya")) {
			//un mes en cada iteracion
				
				
				System.out.println("¿De cuantos dias van a introducirse datos?: ");
				cantDiasDatos= sc.nextInt();
				
				System.out.println("Intoduzca el numero del dia del mes: ");
				numDiaMes= sc.nextInt();
				//es un dia del mes
				
					
				System.out.println("Introduzca la temperatura media del dia introducido: ");
				tempMediaDia= sc.nextFloat();
					if (tempMediaDia<0) {
						System.out.println("Ha habido ciclogenesis");
					}
				
				System.out.println("Introduzca la humedad del dia introducido:");
				humedadDia= sc.nextInt();
					if (humedadDia>mayorDiaHumedad) {
						mayorDiaHumedad=humedadDia;
						
					}
				
				System.out.println("Introduzca la velocidad del viento del dia introducido:");
				velocidadVientoDia= sc.nextInt();
				
					if (velocidadVientoDia>40) {
						System.out.println("Ha habido ciclogenesis");
						
				
				System.out.println("Introduzca estado del cielo del dia introducido: (soleado,nublado,lluvioso)");
				estadoCieloDia= sc.next();
				
				
				}
				 
				
					
						
				
				
				 contadorDias= +cantDiasDatos;
				 
		
			}
		
	
	
	
  sc.close();
	 System.out.println("a(El estado del cielo del dia en el que hubo mas humedad es:");
	 System.out.println("b)Nombre del mes con menor proporcion de dias nublados:");
	 System.out.println("c)Los meses con ciclogenegeis son:");
	 System.out.println("d)Dia y mes mas caluroso:");
	 System.out.println("e)");
	}
	
}
