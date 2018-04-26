package co.edu.sena.selectivamultiple;

import java.util.Scanner;

public class Ejemplo05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcion = teclado.nextInt();
		do {
			

			switch (opcion) {
			case 1:
				System.out.println("opcion Uno");
				break;
				
			case 2:
				System.out.println("opcion dos");
				break;
			case 3:
				System.out.println("opcion tres");
				break;
			case 4:
				System.out.println("opcion cuatro");
				break;
			case 5:
				System.out.println("opcion cinco gracias por usar este software");
				break;
			

			default:
				System.out.println("la opcion que digito no es correcta");

				break;
			}
			
			
		} while (opcion !=5);

	}

}
