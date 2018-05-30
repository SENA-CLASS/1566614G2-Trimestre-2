package co.edu.sena.poo.realizacion;

public class Persona implements PersonaCiega, PersonaMuda, PersonaInvalida, PersonaSordoMuda, PersonaSorda {

	public void comer() {
		System.out.println("como");
	}

	public void caminar() {
		System.out.println("camino");
	}

	public void ver() {
		System.out.println("veo");
	}

	public void hablar() {
		System.out.println("hablo");
	}

	public void escuchar() {
		System.out.println("escucho");
	}

	public void usarBaston() {
		System.out.println("uso el baston");
		
	}

	public void hablarSenias() {
		System.out.println("puedo aprender el lenguaje de señas");
		
	}

}
