package co.edu.sena.poo.asociacion.ontomany3;

import java.util.ArrayList;

public class Ejemplo01 {
    public static void main(String[] args) {
        Canasta c1 = new Canasta();
        c1.setCervezaList(new ArrayList<>());
        c1.getCervezaList().add(new Cerveza("Aguila", 350, 2500));
        c1.getCervezaList().add(new Cerveza("Aguila", 350, 2500));
        c1.getCervezaList().add(new Cerveza("Aguila", 350, 2500));
        c1.getCervezaList().get(0).setCanasta(c1);
        c1.getCervezaList().get(1).setCanasta(c1);
        c1.getCervezaList().get(2).setCanasta(c1);

        for (Cerveza c:c1.getCervezaList()
             ) {
            System.out.println(c.toString());
        }
    }
}
