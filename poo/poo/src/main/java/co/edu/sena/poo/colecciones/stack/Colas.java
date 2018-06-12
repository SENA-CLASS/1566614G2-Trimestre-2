package co.edu.sena.poo.colecciones.stack;

import java.util.LinkedList;
import java.util.Queue;

public class Colas {
    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<>();
        ((LinkedList<Integer>) cola).addFirst(1);
        ((LinkedList<Integer>) cola).addFirst(2);
        ((LinkedList<Integer>) cola).addFirst(3);
        ((LinkedList<Integer>) cola).addFirst(4);

        ((LinkedList<Integer>) cola).addLast(5);
        ((LinkedList<Integer>) cola).addLast(6);
        ((LinkedList<Integer>) cola).addLast(7);
        ((LinkedList<Integer>) cola).addLast(8);

        ((LinkedList<Integer>) cola).removeFirst();// elimina el 4
        ((LinkedList<Integer>) cola).removeLast();// elimina el 8

        for (Integer i:cola
             ) {
            System.out.println(i);
        }
    }
}
