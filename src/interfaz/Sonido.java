package interfaz;

public interface Sonido {
public void voz();
default void vozDormido() {
	System.out.println("Zzz");
}

}
