package co.edu.sena.operadorternario;

public class Ejemplo01 {

	public static void main(String[] args) {
		int a = 4;

		int b = 3 > 4 || 5<9 ? 6 : 8;// operador ternario

		int c;

		if (3 > 4) {
			c = 6;
		} else {
			c = 8;
		}

		System.out.println(b);
		
		int numeroUno= 2,numeroDos=7;
		
		System.out.println(
				numeroUno > numeroDos ?"numero uno es mayor que numero dos"
				:"numero dos es mayor que numero uno");
		

	}

}
