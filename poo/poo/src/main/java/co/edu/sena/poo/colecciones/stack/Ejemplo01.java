package co.edu.sena.poo.colecciones.stack;

import java.util.List;
import java.util.Stack;

public class Ejemplo01 {
    public static void main(String[] args) {

        //stack como pila
        Stack<Integer> pila = new Stack<>();
        ((Stack<Integer>) pila).push(1);
        ((Stack<Integer>) pila).push(2);
        ((Stack<Integer>) pila).push(3);
        ((Stack<Integer>) pila).push(4);

        Integer removido =((Stack<Integer>) pila).pop();

        System.out.println(removido);

        for (Integer n :pila
             ) {
            System.out.println(n);
        }

        
        System.out.println(pila.peek());


    }
}
