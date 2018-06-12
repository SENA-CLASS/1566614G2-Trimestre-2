package co.edu.sena.poo.asociacion.onetomany;

public class Cubeta {
    private double costo;
    private int cantidadTotal;
    private int posicionActual=0;
    private Huevo [] huevos ;

    public Cubeta(int cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
        this.huevos = new Huevo[cantidadTotal];
    }

    public void agregarHuevos(Huevo huevo){
        if(posicionActual<cantidadTotal){
            this.huevos[posicionActual]= huevo;
            this.posicionActual++;
            this.costo += huevo.getPrecio();
        }else{
            System.out.println("en esta cubeta ya no caben mas huevos!!!!");
        }
    }

    public void sacarHuevo(int posicion){
        if(posicion >= 0 && posicion<= posicionActual) {
            this.costo-= this.huevos[posicion].getPrecio();

            Huevo[] huevosTemporal = new Huevo[this.cantidadTotal];
            int posicionActualNueva =0;
            for (int i = 0; i < this.posicionActual ; i++) {
                if(i != posicion){
                    huevosTemporal[posicionActualNueva]= this.huevos[i];
                    posicionActualNueva++;
                }
            }
            this.posicionActual= posicionActualNueva;
            this.huevos =huevosTemporal;

        } else
            System.out.println("esa posición no existe");
    }


    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getCantidadTotal() {
        return cantidadTotal;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public Huevo[] getHuevos() {
        return huevos;
    }

    public void setHuevos(Huevo[] huevos) {
        this.huevos = huevos;
    }
}
