package co.edu.sena.poo.asociacion.ontomany3;

import java.util.Collection;
import java.util.List;

public class Canasta {
    private List<Cerveza> cervezaList;// esta es la relacion de 1 a muchos

    public List<Cerveza> getCervezaList() {
        return cervezaList;
    }

    public void setCervezaList(List<Cerveza> cervezaList) {
        this.cervezaList = cervezaList;
    }

    @Override
    public String toString() {
        return "Canasta{" +
                "cervezaList=" + cervezaList +
                '}';
    }
}
