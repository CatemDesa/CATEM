package ar.com.catem.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ESTADOCIVIL")
public class EstadoCivil implements Serializable {

	private static final long serialVersionUID = 2458336491218308915L;
	
	@GeneratedValue
	@Id
	@Column(name="IDESTADOCIVIL")
	private Integer idEstadoCivil;
	@Column(name="DESCRIPCION")
	private String descripcion;

	public Integer getIdEstadoCivil() {
		return idEstadoCivil;
	}

	public void setIdEstadoCivil(Integer idEstadoCivil) {
		this.idEstadoCivil = idEstadoCivil;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
