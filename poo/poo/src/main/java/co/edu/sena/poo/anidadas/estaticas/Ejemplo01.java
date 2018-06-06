package co.edu.sena.poo.anidadas.estaticas;

public class Ejemplo01 {

	public static void main(String[] args) {
		Clase1 c1 = new Clase1();
		System.out.println(c1);
		Clase1.Clase2 c2 = new Clase1.Clase2();
		System.out.println(c2);
		Clase1.Clase2.Clase3 c3 = new Clase1.Clase2.Clase3();
		System.out.println(c3);
		Clase1.Clase2.Clase3.Clase4 c4 = new Clase1.Clase2.Clase3.Clase4();
		
		
		
		Clase1.Clase2.Clase3.Clase4.Clase5.Clase6.Clase7.Clase8.Clase9 c9 = 
				new Clase1.Clase2.Clase3.Clase4.Clase5.Clase6.Clase7.Clase8.Clase9();
		System.out.println(c9);
		
		

	}

}
