package co.edu.sena.poo.metodoequals;

public class Ejemplo01 {
    public static void main(String[] args) {
        Salon s1= new Salon(305);
        Salon s2= new Salon(305);
        System.out.println(s1.equals(s2) ? true: false);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        Carro carro1 = new Carro("234525");
        Carro carro2 = new Carro(null);
        carro2.equals(carro1);
        carro1.equals(carro2);

        System.out.println(carro1.equals(carro2)?true:false);


    }
}
