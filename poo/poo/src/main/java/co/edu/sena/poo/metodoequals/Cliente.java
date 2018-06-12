package co.edu.sena.poo.metodoequals;

import java.util.Objects;

public class Cliente {
    private String tipoDocumento;
    private String numeroDocumento;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellio;
    private String segundoApellido;
    private String telefono;

    public Cliente(String tipoDocumento, String numeroDocumento, String primerNombre, String segundoNombre, String primerApellio, String segundoApellido, String telefono) {
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellio = primerApellio;
        this.segundoApellido = segundoApellido;
        this.telefono = telefono;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellio() {
        return primerApellio;
    }

    public void setPrimerApellio(String primerApellio) {
        this.primerApellio = primerApellio;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(tipoDocumento, cliente.tipoDocumento) &&
                Objects.equals(numeroDocumento, cliente.numeroDocumento) &&
                Objects.equals(primerNombre, cliente.primerNombre) &&
                Objects.equals(segundoNombre, cliente.segundoNombre) &&
                Objects.equals(primerApellio, cliente.primerApellio) &&
                Objects.equals(segundoApellido, cliente.segundoApellido) &&
                Objects.equals(telefono, cliente.telefono);
    }


}
