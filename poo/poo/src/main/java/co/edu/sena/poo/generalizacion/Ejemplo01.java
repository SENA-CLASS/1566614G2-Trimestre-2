package co.edu.sena.poo.generalizacion;

public class Ejemplo01 {

	public static void main(String[] args) {
		Camion c1= new Camion(4);
		c1.setLlantas(4);
		System.out.println(c1.getLlantas());

		AvionComercial ac = new AvionComercial();
		ac.encender();
		ac.apagar();
		
		AvionMilitarCaza am = new AvionMilitarCaza();
		am.encender();
		am.apagar();
	}

}
