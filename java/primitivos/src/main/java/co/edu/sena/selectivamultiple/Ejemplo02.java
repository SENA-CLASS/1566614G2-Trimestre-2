package co.edu.sena.selectivamultiple;

import java.util.Scanner;

public class Ejemplo02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcion = teclado.nextInt();

		switch (opcion) {
		case 1:
			System.out.println("escribio Uno");
			break;
		case 2:
			System.out.println("escribio dos");
			break;
		case 3:
			System.out.println("escribio tres");
			break;
		case 4:
			System.out.println("escribio cuatro");
			break;
		case 5:
			System.out.println("escribio cinco");
			break;
		case 6:
			System.out.println("escribio seis");
			break;

		default:
			System.out.println("no se lo que escribio");

			break;
		}

	}

}
