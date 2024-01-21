package interfaz;


	import java.util.Arrays;

	public class Cliente implements Comparable<Cliente> {

	    private String dni;
	    private String nombre;
	    private int edad;
	    private double saldo;

	    // Constructor
	    public Cliente(String dni, String nombre, int edad, double saldo) {
	        this.dni = dni;
	        this.nombre = nombre;
	        this.edad = edad;
	        this.saldo = saldo;
	    }
	    
	    public String getNombre() {
	    	return nombre;
	    }

	    // Método toString
	    @Override
	    public String toString() {
	        return "Cliente{" +
	                "dni='" + dni + '\'' +
	                ", nombre='" + nombre + '\'' +
	                ", edad=" + edad +
	                ", saldo=" + saldo +
	                '}';
	    }

	    // Método equals basado en el dni
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        Cliente cliente = (Cliente) obj;
	        return dni.equals(cliente.dni);
	    }

	    // Método compareTo para la interfaz Comparable basado en el dni
	    @Override
	    public int compareTo(Cliente otroCliente) {
	        return this.dni.compareTo(otroCliente.dni);
	    }

	    public static void main(String[] args) {
	        // Crear una tabla con 5 clientes
	        Cliente[] clientes = {
	                new Cliente("12345678A", "Juan", 30, 1500.0),
	                new Cliente("98765432B", "Ana", 25, 2000.0),
	                new Cliente("54321678C", "Carlos", 35, 1000.0),
	                new Cliente("87654321D", "Elena", 28, 1800.0),
	                new Cliente("13579246E", "Pedro", 40, 1200.0)
	        };

	        // Mostrar clientes ordenados por dni
	        Arrays.sort(clientes);
	        System.out.println("Clientes ordenados por DNI:");
	        for (Cliente cliente : clientes) {
	            System.out.println(cliente);
	        }

	        // Mostrar clientes ordenados por nombre
	        Arrays.sort(clientes, (c1, c2) -> c1.nombre.compareTo(c2.nombre));
	        System.out.println("\nClientes ordenados por Nombre:");
	        for (Cliente cliente : clientes) {
	            System.out.println(cliente);
	        }

	        // Mostrar clientes ordenados por edad
	        Arrays.sort(clientes, (c1, c2) -> Integer.compare(c1.edad, c2.edad));
	        System.out.println("\nClientes ordenados por Edad:");
	        for (Cliente cliente : clientes) {
	            System.out.println(cliente);
	        }
	    }
	}



