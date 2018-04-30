package co.edu.sena.ciclos.hagamientras;

public class Ejemplo02 {

	public static void main(String[] args) {
		// como romper un ciclo con break
		int i=1;
		do {
			if(i>100) {
				break;
			}
			System.out.println(i);
			i++;
		} while (true);

	}

}
