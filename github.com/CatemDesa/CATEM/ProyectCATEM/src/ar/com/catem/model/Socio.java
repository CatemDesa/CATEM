package ar.com.catem.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SOCIO")
public class Socio implements Serializable{

	private static final long serialVersionUID = 6606960051574142485L;
	
	@Column(name="IDSOCIO")
	@GeneratedValue
	@Id
	private Integer idSocio;
	@Column(name="IDTIPOSOCIO")
	private Integer idTipoSocio;
	@Column(name="NUMERO_SOCIO")
	private String nroSocio;
	@Column(name="NOMBRE")
	private String apellido;
	@Column(name="APELLIDO")
	private String nombre;
	@Column(name="CELL")
	private String cel;
	@Column(name="NACIONALIDAD")
	private String nacionalidad;
	@Column(name="IDESTADOCIVIL")
	private Integer idEstadoCivil;
	@Column(name="FECHA_NAC")
	private Date fechaNacimiento;
	@Column(name="DNI")
	private String dni;
	@Column(name="OCUPACION")
	private String ocupacion;
	@Column(name="MAIL")
	private String email;
	@Column(name="FECHA_ALTA")
	private Date fechaAlta;
	@Column(name="FECHA_BAJA")
	private Date fechaBaja;
	@Column(name="AFAVOR")
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

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
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
