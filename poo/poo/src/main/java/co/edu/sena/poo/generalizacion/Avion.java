package co.edu.sena.poo.generalizacion;

public abstract class Avion {
	public abstract void encender();
	
	public final void apagar() {
		System.out.println("OFF con llave");
	}
}
