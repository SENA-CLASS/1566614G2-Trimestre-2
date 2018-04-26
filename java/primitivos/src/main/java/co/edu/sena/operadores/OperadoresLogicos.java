package co.edu.sena.operadores;

public class OperadoresLogicos {
	
	public static void main(String [] a) {
		
		if(5 <8 ^ 7<9) {
			System.out.println("verdadero");
			
		}else {
			System.out.println("falso");
		}
		
		if(5 <8 && 7<9) {
			System.out.println("verdadero");
			
		}else {
			System.out.println("falso");
		}
		
		if(5 <8 || 7<9) {
			System.out.println("verdadero");
			
		}else {
			System.out.println("falso");
		}
		
		boolean codicion= true;
		
		System.out.println(!codicion);
		
		if(!(5 <8) || !(7<9)) {
			System.out.println("verdadero");
			
		}else {
			System.out.println("falso");
		}
		
		
	}

}
