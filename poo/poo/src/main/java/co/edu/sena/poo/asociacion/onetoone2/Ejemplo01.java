package co.edu.sena.poo.asociacion.onetoone2;

public class Ejemplo01 {
    public static void main(String[] args) {
        try {
            Caballo caballo = new Caballo(new Corazon(), new Cerebro());
            Silla silla = new Silla("roja");
            caballo.setSilla(silla);
            silla.setCaballo(caballo);
            System.out.println(caballo.getSilla().getColor());

            caballo.setSilla(null);

            System.out.println(caballo.getSilla().getColor());



        }catch (Exception e){
            System.out.println("error es: "+ e.getMessage());
        }






    }
}
