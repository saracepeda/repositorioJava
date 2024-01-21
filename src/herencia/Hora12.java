package herencia;

public class Hora12 extends Hora {
  
    private Meridiano meridiano; // "am" o "pm"

    // Constructor
    public Hora12(int hora, int minutos, Meridiano meridiano) {
        super(hora, minutos);
        this.meridiano=meridiano;
    }

    // Método para incrementar la hora en un minuto
    public void inc() {
        minutos++;
        if (minutos == 60) {
            minutos = 0;
            hora++;
            if (hora == 13) {
                hora = 1;
            }
        }
    }

    // Método para establecer los minutos
    public void setMinutos(int valor) {
        if (valor >= 0 && valor < 60) {
            minutos = valor;
        } else {
            System.out.println("Error: Los minutos deben estar en el rango de 0 a 59.");
        }
    }

    // Método para establecer la hora
    
    public void setHora(int valor) {
        if (valor >= 1 && valor <= 12) {
            hora = valor;
        } else {
            System.out.println("Error: La hora debe estar en el rango de 1 a 12.");
        }
    }

    // Método para establecer el periodo (am/pm)
    public void setMeridiano(Meridiano meridiano) {
        this.meridiano=meridiano;
    }

    // Método para obtener la representación en formato de cadena
    public String toString() {
        return String.format("%02d:%02d %s", hora, minutos, meridiano);
        
        	
        }
        	
        }
