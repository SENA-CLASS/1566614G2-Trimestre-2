package co.edu.sena.poo.asociacion.onetomany;

import java.util.Objects;

public class Huevo {
    private String animal;
    private String color;
    private double precio;

    public Huevo(String animal, String color, double presio) {
        this.animal = animal;
        this.color = color;
        this.precio = presio;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double presio) {
        this.precio = presio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Huevo huevo = (Huevo) o;
        return Double.compare(huevo.precio, precio) == 0 &&
                Objects.equals(animal, huevo.animal) &&
                Objects.equals(color, huevo.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(animal, color, precio);
    }
}
