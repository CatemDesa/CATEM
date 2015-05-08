package ar.com.catem.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TIPO_SOCIO")
public class TipoSocio implements Serializable {

	private static final long serialVersionUID = -2860257088388598233L;
	
	@GeneratedValue
	@Id
	@Column(name="IDTIPOSOCIO")
	private Integer idTipoSocio;
	@Column(name="DESCRIPCION")
	private String descripcion;

	public Integer getIdTipoSocio() {
		return idTipoSocio;
	}

	public void setIdTipoSocio(Integer idTipoSocio) {
		this.idTipoSocio = idTipoSocio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
