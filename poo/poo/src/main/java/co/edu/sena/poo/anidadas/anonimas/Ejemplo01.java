package co.edu.sena.poo.anidadas.anonimas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ejemplo01 {
    public static void main(String[] args) {
        InterfacePersona persona = new InterfacePersona() {
            public void correr() {
                System.out.println("hola");
            }
        };
        persona.correr();
        System.out.println(persona);

        InterfacePersona persona2 = new InterfacePersona() {
            public void correr() {
                System.out.println("co");
            }
        };
        persona2.correr();
        System.out.println(persona2);

        List<Carro> lista = new ArrayList<Carro>();
        lista.add(new Carro("abc-124","mazda"));
        lista.add(new Carro("abc-127","mazda"));
        lista.add(new Carro("abc-124","mazda"));
        lista.add(new Carro("abc-345","mazda"));
        lista.add(new Carro("abc-667","mazda"));
        lista.add(new Carro("abc-098","mazda"));
        System.out.println(lista.getClass().getCanonicalName());
        Collections.sort(lista, new Comparator<Carro>() {
            public int compare(Carro o1, Carro o2) {
                return o1.getPlaca().compareTo(o2.getPlaca());
            }
        });

        for (Carro c: lista
             ) {
            System.out.println(c.getPlaca());
        }






    }
}
