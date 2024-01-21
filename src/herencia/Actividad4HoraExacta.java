package herencia;

public class HoraExacta extends Hora {
    // ... (otros métodos de la clase HoraExacta)

    // Método para comparar si dos horas son iguales
    public boolean equals(HoraExacta otraHora) {
        return this.getHora() == otraHora.getHora() &&
               this.getMinutos() == otraHora.getMinutos() &&
               this.segundos == otraHora.segundos;
    }

    // Método main para probar la comparación de horas
    public static void main(String[] args) {
        HoraExacta hora1 = new HoraExacta(12, 30, 45);
        HoraExacta hora2 = new HoraExacta(12, 30, 45);
        HoraExacta hora3 = new HoraExacta(10, 15, 30);

        System.out.println("Hora1 es igual a Hora2: " + hora1.equals(hora2));
        System.out.println("Hora1 es igual a Hora3: " + hora1.equals(hora3));
    }
}
