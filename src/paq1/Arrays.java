package paq1;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args){
		
     Scanner sc=new Scanner (System.in);
     
     int[] array=new int[5];
     
      for (int i=0; i<array.length;i++) {
    	  System.out.println("Introduzca el valor de la posicion "+i);
    	  array[i]=sc.nextInt();
    	  
      }
     
     
     
     
     sc.close();

	}

}
