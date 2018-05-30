package co.edu.sena.poo.polimorfismo;

public class InstructorTeleinformatica extends Ingeniero {
	
	private int bata;
	
	public void enseniar() {
		System.out.println("estoy enseñando");
	}

	/**
	 * @return the bata
	 */
	public int getBata() {
		return bata;
	}

	/**
	 * @param bata the bata to set
	 */
	public void setBata(int bata) {
		this.bata = bata;
	}
	
	

}
