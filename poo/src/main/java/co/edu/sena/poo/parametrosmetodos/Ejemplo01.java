package co.edu.sena.poo.parametrosmetodos;

public class Ejemplo01 {

    public void correr(int a ){

    }

    public void correr(int a, String b ){

    }

    public void caminar(final int a){

    }

    public  void comer(int ...a){
        for (int aa:a
             ) {
            System.out.println(aa);
        }
    }
    
    public  void comer(double []a){
        for (int i=0; i<a.length;i++) {
            System.out.println(a[i]);
        }
    }



}
