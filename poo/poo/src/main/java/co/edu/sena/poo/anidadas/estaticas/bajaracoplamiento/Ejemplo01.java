package co.edu.sena.poo.anidadas.estaticas.bajaracoplamiento;

public class Ejemplo01 {

	public static void main(String[] args) {
		//Clase1 c1= new Clase1();
		
		InterfaceClase2 c2 = Clase1.getClase2();
		
		InterfaceClase9 c9 = Clase1.Clase2.Clase3.Clase4.Clase5.Clase6.Clase7.Clase8.getClase9();
		
		

	}

}
