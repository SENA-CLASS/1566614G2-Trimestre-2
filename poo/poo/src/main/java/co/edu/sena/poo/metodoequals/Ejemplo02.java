package co.edu.sena.poo.metodoequals;

public class Ejemplo02 {
    public static void main(String[] args) {
        Carro c1 = new Carro("123");
        Carrito c2 = new Carrito("123");

        System.out.println(c1.equals(c2)?"verdad":"falso");

    }
}
