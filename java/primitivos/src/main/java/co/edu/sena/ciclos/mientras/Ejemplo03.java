package co.edu.sena.ciclos.mientras;

public class Ejemplo03 {

	public static void main(String[] args) {
		// break; rompe ciclos
//		int i=1;
//		while(i<=100) {
//			System.out.println(i);
//			i++;
//		}
		
		int i=1;
		while(true) {
			if(!(i<=100)) {
				break;
			}
			System.out.println(i);
			i++;
		}

	}

}
