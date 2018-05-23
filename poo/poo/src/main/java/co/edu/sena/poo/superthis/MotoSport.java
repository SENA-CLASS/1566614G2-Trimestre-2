package co.edu.sena.poo.superthis;

public class MotoSport extends Moto {
    private String carenaje;

    public MotoSport(String marca,  double precio, int modelo, String carenaje) {
        super(marca, precio,modelo);
        this.carenaje= carenaje;

    }
}
