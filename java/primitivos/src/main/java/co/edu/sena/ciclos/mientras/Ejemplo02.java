package co.edu.sena.ciclos.mientras;

import java.util.Scanner;

public class Ejemplo02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numeroLeido = teclado.nextInt();
		
		int i=1;
		while(i<=10) {
			System.out.println(numeroLeido+" * "+i+" = "+(numeroLeido*i));
			i++;
		}
		
		

	}

}
