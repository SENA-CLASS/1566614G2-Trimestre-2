package co.edu.sena.poo.estaticos;

import javax.swing.*;

public class Ejemplo01 {
	
	public static void main(String ...args) {
		System.out.println(Matematica.PI);
		System.out.println(Matematica.VELOCIDAD_DE_LA_LUZ);
		
		Matematica m = new Matematica();
		System.out.println(m.CONSTANTE);
		
		Matematica.var=10;
		System.out.println(Matematica.var);
		
		System.out.println(Matematica.sumar(2, 3));

		System.out.println(Matematica.PI);// correcto
		Matematica ma = new Matematica();
		System.out.println(ma.PI);// incorrecto pero no genera error de compilación


		JOptionPane.showMessageDialog(null, ma.PI);

		
	}

}
