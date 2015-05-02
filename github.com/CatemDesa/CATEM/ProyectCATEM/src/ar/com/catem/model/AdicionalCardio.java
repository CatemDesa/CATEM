package ar.com.catem.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ADICIONAL_CARDIO")
public class AdicionalCardio implements Serializable{

	private static final long serialVersionUID = 531524947664078907L;

	@Id
	@GeneratedValue
	@Column(name="IDADICCARDIO")
	private Integer idAdic;
	@Column(name="IDSOCIO")
	private Integer idSocio;
	@Column(name="NOMBRE")
	private String nombre;
	@Column(name="APELLIDO")
	private String apellido;
	@Column(name="DNI")
	private String dni;
	@Column(name="IDDOMICILIO")
	private Integer domicilios;

	public Integer getIdAdic() {
		return idAdic;
	}

	public void setIdAdic(Integer idAdic) {
		this.idAdic = idAdic;
	}

	public Integer getIdSocio() {
		return idSocio;
	}

	public void setIdSocio(Integer idSocio) {
		this.idSocio = idSocio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Integer getDomicilios() {
		return domicilios;
	}

	public void setDomicilios(Integer domicilios) {
		this.domicilios = domicilios;
	}

}
