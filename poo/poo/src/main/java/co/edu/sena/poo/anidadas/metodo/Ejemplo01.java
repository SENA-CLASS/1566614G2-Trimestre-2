package co.edu.sena.poo.anidadas.metodo;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo01 {
    public static void main(String[] args) {
        class Perro{
            public void ladar(){
                System.out.println("wau wau");
            }
        }
        Perro p1 = new Perro();
        System.out.println(p1);
        p1.ladar();



    }
}
