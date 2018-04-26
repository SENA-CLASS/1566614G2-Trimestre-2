package co.edu.sena.selectivamultiple;

import java.util.Scanner;

public class Ejemplo01 {

	public static void main(String[] args) {
		//switch key pseint int, char en java el key entero, 1.7 string
		Scanner teclado = new Scanner(System.in);
		String opcion = teclado.next();
		
		
		
		switch (opcion) {
		case "hola":
			System.out.println("escribio hola");
			break;

		default:
			System.out.println("no se lo que escribio");
			
			break;
		}

	}

}
