package ar.com.catem.model;

import java.math.BigDecimal;
import java.util.Date;

public class Socio {

	private Integer idSocio;
	private Integer idTipoSocio;
	private String nroSocio;
	private String apellido;
	private String nombre;
	private String cel;
	private String nacionalidad;
	private Integer idEstadoCivil;
	private Date fechaNacimiento;
	private String dni;
	private Integer idOcupacion;
	private String email;
	private Date fechaAlta;
	private Date fechaBaja;
	private BigDecimal aFavor;

	public Integer getIdSocio() {
		return idSocio;
	}

	public void setIdSocio(Integer idSocio) {
		this.idSocio = idSocio;
	}

	public Integer getIdTipoSocio() {
		return idTipoSocio;
	}

	public void setIdTipoSocio(Integer idTipoSocio) {
		this.idTipoSocio = idTipoSocio;
	}

	public String getNroSocio() {
		return nroSocio;
	}

	public void setNroSocio(String nroSocio) {
		this.nroSocio = nroSocio;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCel() {
		return cel;
	}

	public void setCel(String cel) {
		this.cel = cel;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public Integer getIdEstadoCivil() {
		return idEstadoCivil;
	}

	public void setIdEstadoCivil(Integer idEstadoCivil) {
		this.idEstadoCivil = idEstadoCivil;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Integer getIdOcupacion() {
		return idOcupacion;
	}

	public void setIdOcupacion(Integer idOcupacion) {
		this.idOcupacion = idOcupacion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Date getFechaBaja() {
		return fechaBaja;
	}

	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	public BigDecimal getaFavor() {
		return aFavor;
	}

	public void setaFavor(BigDecimal aFavor) {
		this.aFavor = aFavor;
	}

}
