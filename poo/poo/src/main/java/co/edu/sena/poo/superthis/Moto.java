package co.edu.sena.poo.superthis;


public class Moto extends Object {
    private String marca;
    private double precio;
    private int modelo;

    public Moto(String marca, double precio, int modelo) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    public int getModelo() {
        return modelo;
    }
}
