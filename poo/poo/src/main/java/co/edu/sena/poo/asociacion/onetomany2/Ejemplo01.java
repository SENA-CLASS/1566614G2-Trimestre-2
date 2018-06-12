package co.edu.sena.poo.asociacion.onetomany2;

public class Ejemplo01 {
    public static void main(String[] args) {
        Cubeta cubeta = new Cubeta(30);
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("avestruz","blanco",3000));
        cubeta.agergarHuevo(new Huevo("cocodrillo","blanco",3090));
        cubeta.agergarHuevo(new Huevo("avion","blanco",3000));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));

        System.out.println(cubeta.getCosto());

        cubeta.quitarHuevo(0);

        System.out.println(cubeta.getCosto());

        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));
        cubeta.agergarHuevo(new Huevo("gallina","blanco",300));

        System.out.println(cubeta.getCosto());

        for (int i=0; i<cubeta.getHuevos().size();i++) {
            System.out.println("huevo ---------------------- "+i);
            System.out.println(cubeta.getHuevos().get(i).getAnimal());
            System.out.println(cubeta.getHuevos().get(i).getColor());
            System.out.println(cubeta.getHuevos().get(i).getPrecio());
            System.out.println("----------------------------");
        }

    }
}
