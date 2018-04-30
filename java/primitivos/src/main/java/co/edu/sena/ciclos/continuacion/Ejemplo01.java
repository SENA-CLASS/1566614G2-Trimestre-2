package co.edu.sena.ciclos.continuacion;

public class Ejemplo01 {

	public static void main(String[] args) {
		int i=0;
		while(i<=1000) {
			if(i++%2==1) {
				continue;
			}
			System.out.println(i);
		}
		
		

	}

}
