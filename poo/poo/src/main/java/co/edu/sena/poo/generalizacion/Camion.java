package co.edu.sena.poo.generalizacion;

public class Camion extends Automovil {
	private double carga;



	public Camion(int llantas) {
		super(llantas);
		
	}
	
	/**
	 * este todo hace algo
	 * @param llantas
	 * @param serial
	 * @param carga
	 */
	public Camion(int llantas, int serial, double carga) {
		super(llantas, serial);
		this.carga= carga;
		// TODO
	}

}
