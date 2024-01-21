package interfaz;

import java.util.Comparator;

public class ComparadorClienteNombre implements Comparator <Cliente> {
	ComparadorClienteNombre ccn = new ComparadorClienteNombre();
	String nombre;
public String getNombre() {
	return nombre;
}
	@Override
	public int compare(Cliente o1, Cliente o2) {
		int res; 
		if (compare(o1, o2)<0) {
			System.out.println("O1 es menor");
		}else { if(compare(o1, o2)>0) {
			System.out.println("Es mayor");
		}else {
			System.out.println("Son iguales");
		}
		
		return res;
		
	
		
		
		
		
		}
	}
 
	




