package co.edu.sena.poo.encapsulamiento;

public class Ejemplo01 {
    public static void main(String[] args) {
        Perro objectoPerro = new Perro();
        objectoPerro.setNombre("pili");
        objectoPerro.setRaza("pilbull");
        objectoPerro.setSexo("perrita");

        System.out.println(objectoPerro.getNombre());
        System.out.println(objectoPerro.getRaza());
        System.out.println(objectoPerro.getSexo());

        Gato objetoGato = new Gato();
        objetoGato.nombre= "gatita";
        objetoGato.raza="siames";

        System.out.println(objetoGato.nombre);
        System.out.println(objetoGato.raza);

    }
}
