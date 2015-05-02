package ar.com.catem.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CARDIO_SOCIO")
public class CardioSocio implements Serializable{

	private static final long serialVersionUID = -5476483065736531715L;
	
	@Id
	@GeneratedValue
	@Column(name="IDSOCIOCARDIO")
	private Integer idCardioSocio;
	@Column(name="IDSOCIO")
	private Integer idSocio;
	@Column(name="FECHA_ALTA")
	private Date fechaAlta;
	@Column(name="FECHA_BAJA")
	private Date fechaBaja;

	public Integer getIdCardioSocio() {
		return idCardioSocio;
	}

	public void setIdCardioSocio(Integer idCardioSocio) {
		this.idCardioSocio = idCardioSocio;
	}

	public Integer getIdSocio() {
		return idSocio;
	}

	public void setIdSocio(Integer idSocio) {
		this.idSocio = idSocio;
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

}
