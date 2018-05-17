package co.edu.sena.poo.generalizacion;

public class Automovil {
	private int llantas;
	private int serial;
	
	


	public Automovil(int llantas) {
		super();
		this.llantas = llantas;
	}

	public Automovil(int llantas, int serial) {
		super();
		this.llantas = llantas;
		this.serial = serial;
	}

	public int getLlantas() {
		return llantas;
	}

	public void setLlantas(int llantas) {
		this.llantas = llantas;

	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

}
