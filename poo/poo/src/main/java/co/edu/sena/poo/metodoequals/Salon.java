package co.edu.sena.poo.metodoequals;

public class Salon {
    private int numero;

    public Salon(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object obj) {
        Salon st = (Salon)obj;
        return this.numero == st.numero;
    }

    @Override
    public int hashCode() {
        return this.numero;
    }
}
