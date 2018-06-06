package co.edu.sena.poo.realizacion;

public class APP {

	public static void main(String[] args) {
		PersonaMuda p1 = new Persona();

		PersonaSorda p2 = new Persona();
		
		PersonaCiega p3 = (PersonaCiega)p2;

	}

}
