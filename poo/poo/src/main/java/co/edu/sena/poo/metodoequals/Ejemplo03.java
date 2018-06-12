package co.edu.sena.poo.metodoequals;

public class Ejemplo03 {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("CC", "123","jose","antonio","martinez",null,null);
        Cliente c2 = new Cliente("CC", "123","jose","antonio","martinez",null,null);

        System.out.println(c1.equals(c2));
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

    }
}
