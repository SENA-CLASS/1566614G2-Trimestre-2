package co.edu.sena.poo.asociacion.onetoone;

public class Carro {
    private String placa;
    private Conductor conductor;

    public Carro(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }
}
