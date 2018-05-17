package co.edu.sena.poo.sobrecarga;

public class Computador {
	// atributos
	private String tipo;
	private long serial;
	private String marca;

	// contructores
	public Computador(String tipo) {
		this.tipo = tipo;
	}

	public Computador(long serial) {
		this.serial = serial;
	}

	public Computador(String marca, String tipo) {
		this.marca = marca;
		this.tipo = tipo;
	}

	public Computador(String tipo, long serial, String marca) {
		this.tipo = tipo;
		this.serial = serial;
		this.marca = marca;
	}

	// metodos genericos
	public void encender() {
		System.out.println("ON con bonton");
	}

	public void encender(byte senal) {
		if (senal == 1) {
			System.out.println("ON con control");
		} else {
			System.out.println("no se que senal es esa");
		}
	}

	// getters and setters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public long getSerial() {
		return serial;
	}

	public void setSerial(long serial) {
		this.serial = serial;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
}
