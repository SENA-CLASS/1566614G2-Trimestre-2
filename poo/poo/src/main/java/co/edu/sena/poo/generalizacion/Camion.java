package co.edu.sena.poo.generalizacion;

public class Camion extends Automovil {
	private double carga;



	public Camion(int llantas) {
		super(llantas);
		
	}
	
	public Camion(int llantas, int serial, double carga) {
		super(llantas, serial);
		this.carga= carga;
	}

}
