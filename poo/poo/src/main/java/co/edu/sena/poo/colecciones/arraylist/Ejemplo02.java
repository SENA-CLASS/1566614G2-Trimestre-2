package co.edu.sena.poo.colecciones.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Ejemplo02 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);// es para adicionar elemento a la colección
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(120);

        lista.set(0,120);

        System.out.println(lista.get(4));
        System.out.println(lista.size());
        lista.remove(3);
        lista.remove(new Integer(120));


        //monstrar el contenido de un arreglo
        System.out.println("----------------------");
        for (int i = 0; i < lista.size() ; i++) {
            System.out.println(lista.get(i));
        }


        Collection<Integer> colecion = new ArrayList<>();
        colecion.add(1);
        colecion.add(2);
        colecion.add(3);
        colecion.add(4);
        colecion.add(5);
        colecion.add(6);



        //recorrer un colleccion usando el patron iteraror
        System.out.println("---------impresion por medio de un patron iterator");
        Iterator i = colecion.iterator();
        while (i.hasNext()){
            Integer numeroTemporal = (Integer) i.next();
            System.out.println(numeroTemporal);
        }

        // como recorre una colecion con un foreach
        for (Integer numeroTemporal: colecion) {
            System.out.println(numeroTemporal);
        }











    }
}
