package ar.com.catem.model;

public class DescripcionCuenta {

	private Integer idDescCuenta;
	private String descripcion;
	private Integer idRubro;

	public Integer getIdDescCuenta() {
		return idDescCuenta;
	}

	public void setIdDescCuenta(Integer idDescCuenta) {
		this.idDescCuenta = idDescCuenta;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getIdRubro() {
		return idRubro;
	}

	public void setIdRubro(Integer idRubro) {
		this.idRubro = idRubro;
	}

}
