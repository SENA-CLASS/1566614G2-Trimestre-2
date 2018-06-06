package co.edu.sena.poo.anidadas.nostatic;

public class Ejemplo01 {

	public static void main(String[] args) {
		Clase1 c1 = new Clase1();
		
		Clase1.Clase2 c2 = c1.new Clase2();
		
		Clase1.Clase2.Clase3 c3 = c2.new Clase3();

		Clase1.Clase2.Clase3.Clase4 c4 = c3.new Clase4();
		
		Clase1.Clase2.Clase3.Clase4.Clase5 c5 = c4.new Clase5();

	}

}
