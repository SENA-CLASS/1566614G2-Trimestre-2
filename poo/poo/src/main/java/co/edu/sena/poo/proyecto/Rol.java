package co.edu.sena.poo.proyecto;

import java.util.List;

public class Rol {
	private String descripcion;
	private boolean estado;
	private List<ClienteHasRol> clientesList;
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public List<ClienteHasRol> getClientesList() {
		return clientesList;
	}
	public void setClientesList(List<ClienteHasRol> clientesList) {
		this.clientesList = clientesList;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clientesList == null) ? 0 : clientesList.hashCode());
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + (estado ? 1231 : 1237);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rol other = (Rol) obj;
		if (clientesList == null) {
			if (other.clientesList != null)
				return false;
		} else if (!clientesList.equals(other.clientesList))
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (estado != other.estado)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Rol [descripcion=" + descripcion + ", estado=" + estado + "]";
	}
	
}
