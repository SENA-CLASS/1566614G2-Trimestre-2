package co.edu.sena.poo.asociacion.onetomany;

import co.edu.sena.poo.asociacion.onetoone2.Caballo;

public class Ejemplo01 {
    public static void main(String[] args) {
        Cubeta cubeta = new Cubeta(30);
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("avestruz","blanco",3000));
        cubeta.agregarHuevos(new Huevo("cocodrillo","blanco",1000));
        cubeta.agregarHuevos(new Huevo("aguila","blanco",30000));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        cubeta.agregarHuevos(new Huevo("gallina","blanco",300));



        System.out.println("costo de su cubeta es:"+ cubeta.getCosto());

        cubeta.sacarHuevo(0);

        System.out.println("costo de su cubeta es:"+ cubeta.getCosto());

        //cubeta.agregarHuevos(new Huevo("gallina","blanco",300));
        //System.out.println("costo de su cubeta es:"+ cubeta.getCosto());

        // este bloque imprime el contenido de la cubeta
        for(int i =0; i<cubeta.getPosicionActual(); i++ ){
            if(cubeta.getHuevos()[i] !=null) {
                System.out.println("huevo posicion" + (i) + "----------------------------------");
                System.out.println(cubeta.getHuevos()[i].getAnimal());
                System.out.println(cubeta.getHuevos()[i].getColor());
                System.out.println(cubeta.getHuevos()[i].getPrecio());
                System.out.println("----------------------------------------------------------");
            }else{
                System.out.println("huevo posicion" + (i + 1) + "----------------------------------");
                System.out.println("no hay huevo");

                System.out.println("----------------------------------------------------------");
            }
        }

    }
}
