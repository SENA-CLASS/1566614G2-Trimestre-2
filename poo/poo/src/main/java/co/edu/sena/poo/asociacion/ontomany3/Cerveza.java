package co.edu.sena.poo.asociacion.ontomany3;

import java.util.Objects;

public class Cerveza {
    private String marca;
    private double cantidad;
    private double precio;

    private Canasta canasta;

    public Cerveza(String marca, double cantidad, double precio) {
        this.marca = marca;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Canasta getCanasta() {
        return canasta;
    }

    public void setCanasta(Canasta canasta) {
        this.canasta = canasta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cerveza cerveza = (Cerveza) o;
        return Double.compare(cerveza.cantidad, cantidad) == 0 &&
                Double.compare(cerveza.precio, precio) == 0 &&
                Objects.equals(marca, cerveza.marca);
    }

    @Override
    public int hashCode() {

        return Objects.hash(marca, cantidad, precio);
    }

    @Override
    public String toString() {
        return "Cerveza{" +
                "marca='" + marca + '\'' +
                ", cantidad=" + cantidad +
                ", precio=" + precio +

                '}';
    }
}
