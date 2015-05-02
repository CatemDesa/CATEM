package ar.com.catem.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="DOMICILIO")
public class Domicilio implements Serializable{

	private static final long serialVersionUID = 2458952892647120267L;
	
	@Id
	@GeneratedValue
	@Column(name="IDDOMICILIO")
	private Integer idDomicilio;
	@Column(name="CALLE")
	private String calle;
	@Column(name="NUMERO")
	private String numero;
	@Transient
	private String provincia;
	@Column(name="LOCALIDAD")
	private String localidad;
	@Column(name="TELEFONO")
	private String telefono;
	@Column(name="IDTIPODOMICILIO")
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
