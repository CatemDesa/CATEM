package ar.com.catem.model;

public class Rubro {

	private Integer idRubro;
	private String descripcion;
	private Integer salida; // 0 y 2 Entradas - 1 y 2 Salidas

	public Integer getIdRubro() {
		return idRubro;
	}

	public void setIdRubro(Integer idRubro) {
		this.idRubro = idRubro;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getSalida() {
		return salida;
	}

	public void setSalida(Integer salida) {
		this.salida = salida;
	}

}
