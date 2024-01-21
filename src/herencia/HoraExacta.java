package herencia;


public class HoraExacta extends Hora {
    private int segundo;

    public HoraExacta(int hora, int minuto, int segundo) {
        super(hora, minuto);
        setSegundo(segundo);
    }

    public void setSegundo(int valor) {
        if (valor >= 0 && valor < 60) {
            segundo = valor;
        } else {
            System.out.println("Valor de segundo no válido.");
        }
    }

    @Override
    public void inc() {
        segundo++;
        if (segundo == 60) {
            segundo = 0;
            super.inc();
        }
    }

    @Override
    public String toString() {
        return super.toString() + String.format(":%02d", segundo);
    }
}

