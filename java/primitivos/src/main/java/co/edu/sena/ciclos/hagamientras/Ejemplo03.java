package co.edu.sena.ciclos.hagamientras;

import java.util.Scanner;

public class Ejemplo03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numeroLeido = teclado.nextInt();
		int i=1;
		do {
			
			System.out.println(numeroLeido+" + "+i+" = "+(numeroLeido+i));
			i++;
		} while (i<=10);

	}

}
