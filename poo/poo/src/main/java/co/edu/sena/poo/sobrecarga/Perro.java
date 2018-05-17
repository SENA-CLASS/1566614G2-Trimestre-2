package co.edu.sena.poo.sobrecarga;

public class Perro {
	
	// sobrecarga de constructores
	public Perro() {
		
	}
	
	public Perro(int a) {
		
	}
	
	public Perro(String b) {
		
	}
	
	//metodos sobrecargados son metodos que tiene el mismo nombre pero difentes firma o parametros
	public void correr() {
		System.out.println("corro");
	}
	
	public void correr(int kilometros) {
		System.out.println("corro "+ kilometros);
	}
	
	public void correr(short patas) {
		System.out.println("corren con: "+patas+" patas");
	}
	
	

}
