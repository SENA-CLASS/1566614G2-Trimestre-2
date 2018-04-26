package co.edu.sena.selectivamultiple;

import java.util.Scanner;

public class Ejemplo03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcion = teclado.nextInt();

		switch (opcion) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
			System.out.println("es impar");
			break;
		case 2:
		case 4:
		case 6:
		case 8:
			System.out.println("es par");
			break;
		
		
		

		default:
			System.out.println("este numero no es valido");

			break;
		}

	}

}
