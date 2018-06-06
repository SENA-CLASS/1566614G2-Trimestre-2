package co.edu.sena.poo.anidadas.nostatic.bajoacoplamiento;

public class Ejemplo01 {

	public static void main(String[] args) {
		Clase1 c1 = new Clase1();
		
		InterfaceClase2 c2 = c1.getClase2();
		
		InterfaceClase3 c3 = c2.getClase3();

		InterfaceClase4 c4 = c3.getClase4();
		
		InterfaceClase5 c5 = c4.getClase5();

	}

}
