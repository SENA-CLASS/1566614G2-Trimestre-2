package co.edu.sena.actividad01;

public class Celular {
	private String referencia;
	private String marca;
	private String modelo;
	private float precio;
	
	public Celular() {
		
	}
	public String getReferencia() {
		return this.referencia;
	}
	
	public void setReferencia(String referencia) {
		this.referencia=referencia;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setMarca(String marca) {
		this.marca= marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo= modelo;
	}
	
	public float getPrecio() {
		return this.precio;
	}
	
	public void setPrecio(float precio) {
		this.precio=precio;
	}
	
}
