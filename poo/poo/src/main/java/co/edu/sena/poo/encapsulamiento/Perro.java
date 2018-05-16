package co.edu.sena.poo.encapsulamiento;

public class Perro {
    // encapsular es poner todos los atributos private
    private String nombre;
    private String raza;
    private String sexo;

    /**
     * metodo accesor(getter) de el atributo nombre
     * @return el nombre del perro
     */
    public String getNombre(){
        return this.nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * metodo mutador(setter) del atributo nombre
     * @param nombre
     */
    public void setNombre(String nombre){
        this.nombre= nombre;
    }



}
