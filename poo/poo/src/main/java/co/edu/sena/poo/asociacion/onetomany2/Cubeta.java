package co.edu.sena.poo.asociacion.onetomany2;

import co.edu.sena.poo.asociacion.onetomany.Huevo;

import java.util.ArrayList;
import java.util.List;

public class Cubeta {
    private double costo;
    private int cantidadTotal;
    private int posicionActual=0;
    private List<co.edu.sena.poo.asociacion.onetomany2.Huevo> huevos;

    public Cubeta(int cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
        this.huevos= new ArrayList<>();
    }

    public void agergarHuevo(co.edu.sena.poo.asociacion.onetomany2.Huevo huevo){
        if(this.posicionActual<this.cantidadTotal) {
            this.huevos.add(huevo);
            this.costo += huevo.getPrecio();
            this.posicionActual++;
        }else{
            System.out.println("no puedo agregar mas huevos");
        }
    }

    public void quitarHuevo(int posicion){
        if(this.huevos.size()>posicion) {
            this.costo-=huevos.get(posicion).getPrecio();
            this.huevos.remove(posicion);
            this.posicionActual--;
        }

    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getCantidadTotal() {
        return cantidadTotal;
    }

    public void setCantidadTotal(int cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public List<co.edu.sena.poo.asociacion.onetomany2.Huevo> getHuevos() {
        return huevos;
    }

    public void setHuevos(List<co.edu.sena.poo.asociacion.onetomany2.Huevo> huevos) {
        this.huevos = huevos;
    }
}
