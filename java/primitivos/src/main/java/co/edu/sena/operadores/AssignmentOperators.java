package co.edu.sena.operadores;

public class AssignmentOperators {

	public static void main(String[] args) {
		int a = 5;
		a+=5;//a=a+5;
		a*=2;//a=a*2;
		a/=2;//a=a/2;
		a-=5;//a=a-5;
		
		int b=12;
		b+=14;
		b++;
		b-=11;
		System.out.println(++b);
		
		
		int numeroUno = 54;
		int numeroDos =63;
		
		int numeroFinal =numeroUno&numeroDos;
		System.out.println(numeroFinal);
		
		

	}

}
