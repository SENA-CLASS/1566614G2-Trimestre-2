package co.edu.sena.selectivamultiple;

import java.util.Scanner;

public class Ejemplo05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcion = teclado.nextInt();
		do {
			

			switch (opcion) {
			case 1:
				System.out.println("Opción Uno administración ");
				break;
				
			case 2:
				System.out.println("Opción dos");
				break;
			case 3:
				System.out.println("Opción tres");
				break;
			case 4:
				System.out.println("Opción cuatro");
				break;
			case 5:
				System.out.println("Opción cinco gracias por usar este software");
				break;
			

			default:
				System.out.println("La opción que selecciono no es correcta");

				break;
			}
			
			
		} while (opcion !=5);

	}

}
