package co.edu.sena.poo.asociacion.onetoone2;

public class Caballo {
    private Corazon corazon;
    private Cerebro cerebro;
    private Silla silla;

    // esto me implica una composición
    public Caballo(Corazon corazon, Cerebro cerebro) {
        this.corazon = corazon;
        this.cerebro = cerebro;
    }

    public Corazon getCorazon() {
        return corazon;
    }

    public Cerebro getCerebro() {
        return cerebro;
    }

    public Silla getSilla() {
        return silla;
    }

    public void setSilla(Silla silla) {
        this.silla = silla;
    }
}
