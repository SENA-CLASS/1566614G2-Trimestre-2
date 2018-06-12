package co.edu.sena.poo.asociacion.onetoone;

public class Ejemplo01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("34234");
        System.out.println("id de carro"+carro1);
        System.out.println("que conducor tiene el carro"+carro1.getConductor());
        carro1.setConductor(new Conductor());
        System.out.println("que conductor tiene el carro"+carro1.getConductor());

        Conductor conductor1 = new Conductor();
        System.out.println("id conductor: "+conductor1);
        carro1.setConductor(conductor1);

        System.out.println("que carro tiene el conducto:" +conductor1.getCarro());
        conductor1.setCarro(carro1);
        System.out.println("que carro tiene el conducto:" +conductor1.getCarro());

        Carro c1 = new Carro("12345");
        Carro c2 = new Carro("12345");

        if(c1 == c2){
            System.out.println("son iguales");
        }else{
            System.out.println("diferentes");
        }



    }
}
