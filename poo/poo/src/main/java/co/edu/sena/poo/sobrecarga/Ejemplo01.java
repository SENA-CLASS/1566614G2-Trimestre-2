package co.edu.sena.poo.sobrecarga;

import java.util.ArrayList;

public class Ejemplo01 {
	
	
	public static void main(String ...args) {
		Perro a = new Perro();
		Perro b = new Perro(5);
		Perro c = new Perro("pepito");
		
		Computador c1 = new Computador(1234);
		System.out.println(c1.getMarca());
		System.out.println(c1.getSerial());
		System.out.println(c1.getTipo());
		System.out.println("---------------------");
		Computador c2 = new Computador("portatil");
		System.out.println(c2.getMarca());
		System.out.println(c2.getSerial());
		System.out.println(c2.getTipo());
		
		c1.encender();
		c1.encender((byte)0);
		c1.encender((byte)1);

	}

}
