package co.edu.sena.poo.colecciones.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo {
    public static void main(String[] args) {
        ArrayList<Integer> arreglo = new ArrayList<>();

        List<Integer> lista = new ArrayList<>();
        lista.add(2);

        //este es normal en java 1.4
        ArrayList arreglo2 = new ArrayList();
        arreglo2.add(1);
        arreglo2.add('A');
        arreglo2.add(2.6F);

        for(int i =0; i<arreglo2.size(); i++){
            if(arreglo2.get(i) instanceof Integer){
                System.out.println("el arreglo en la posicion "+i+" es un entero");
            }else if(arreglo2.get(i) instanceof Character){
                System.out.println("el arreglo en la posicion "+i+" es un caracter");
            }else if(arreglo2.get(i)instanceof Float){
                System.out.println("el arreglo en la posicion "+i+" es un float");
            }
        }

    }
}
