package ar.com.catem.model;

public class Domicilio {

	private Integer idDomicilio;
	private String calle;
	private String numero;
	private String provincia;
	private String localidad;
	private String telefono;
	private Integer idTipoDomicilio;

	public Integer getIdDomicilio() {
		return idDomicilio;
	}

	public void setIdDomicilio(Integer idDomicilio) {
		this.idDomicilio = idDomicilio;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Integer getIdTipoDomicilio() {
		return idTipoDomicilio;
	}

	public void setIdTipoDomicilio(Integer idTipoDomicilio) {
		this.idTipoDomicilio = idTipoDomicilio;
	}

}
