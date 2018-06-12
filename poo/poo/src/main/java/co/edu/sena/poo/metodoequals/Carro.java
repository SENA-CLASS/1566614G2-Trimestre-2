package co.edu.sena.poo.metodoequals;

import java.util.Objects;

public class Carro {
    private String placa;

    public Carro(String placa) {
        this.placa = placa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(placa, carro.placa);
    }

    @Override
    public int hashCode() {

        return Objects.hash(placa);
    }
}
