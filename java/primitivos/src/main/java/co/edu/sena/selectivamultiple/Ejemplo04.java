package co.edu.sena.selectivamultiple;

import java.util.Scanner;

public class Ejemplo04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		char letra = teclado.nextLine().charAt(0);
		
		switch (letra) {
		case 'a':
			System.out.println("escrio la a");
			break;
		case 'e':
			System.out.println("escrio la e");
			break;
		case 'i':
			System.out.println("escrio la i");
			break;
		case 'o':
			System.out.println("escrio la o");
			break;
		case 'u':
			System.out.println("escrio la u");
			break;

		default:
			System.out.println("no reconosco ese caracter");
			break;
		}
		
		
		

	}

}
