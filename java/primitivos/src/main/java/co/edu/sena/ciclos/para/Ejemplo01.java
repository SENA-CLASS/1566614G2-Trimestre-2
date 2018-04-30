package co.edu.sena.ciclos.para;

public class Ejemplo01 {

	public static void main(String[] args) {
		int i;
		for(i = 0;i<=5; i++) {
			System.out.println(i);
		}
		
		
		for(int j = 0;j<=5; j++) {
			System.out.println(j);
		}
		
		for(int j = 0;j<=5; ) {
			System.out.println(j);
			j++;
		}
		
		for(int j = 0;j<=5;++j ) {
			System.out.println(j);
		}
		
		for(int j = 0;j<=5; ) {
			j++;
			System.out.println(j);
		}

	}

}
