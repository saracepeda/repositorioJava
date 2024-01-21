package herencia;

public class Hora {
protected int hora;
protected int minutos;

//constructor
 public Hora(int hora, int minutos) {
 setHora(hora);
 setMinutos(minutos);
 
}	


//metodo para incrementar la hora en un minuto
 public void inc() {
	 this.minutos++;
	  if (this.minutos==60) {
		  this.minutos=0;
		  hora=(hora+1);//o hora++
		  
	  }
	  
	  
 }
	  
	  public void setMinutos (int valor) {
		  if (valor>=0 && valor <60) {
			  this.minutos = valor;
		  }else {
				  System.out.println("Error: Valor minutos fuera de rango");
			  }
		  }
 
 public void setHora(int valor) {
	 if (valor >=0 && valor <24) {
		 hora = valor;
	 }else {
		 System.out.println("Error: Valor hora fuera de rango");
	 }
 }
 // Método para obtener la representación en formato de cadena
 public String toString() {
     return String.format("%02d:%02d", hora, minutos);
 }

 // Método main para probar la clase
 public static void main(String[] args) {
     Hora miHora = new Hora(12, 30);
     System.out.println("Hora actual: " + miHora.toString());

     miHora.inc();
     System.out.println("Después de incrementar un minuto: " + miHora.toString());

     miHora.setMinutos(45);
     System.out.println("Después de establecer minutos a 45: " + miHora.toString());

     miHora.setHora(23);
     System.out.println("Después de establecer hora a 23: " + miHora.toString());
 }
}
	
	
	


