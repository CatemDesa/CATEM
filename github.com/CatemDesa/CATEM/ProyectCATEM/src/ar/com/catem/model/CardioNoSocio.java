package ar.com.catem.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CARDIO_NOSOCIO")
public class CardioNoSocio implements Serializable{

	private static final long serialVersionUID = -4223159218361099363L;
	
	@Id
	@GeneratedValue
	@Column(name="IDNSOCIO")
	private Integer idCardioNS;
	@Column(name="IDADICIONAL")
	private Integer idAdicional;
	@Column(name="FECHA_ALTA")
	private Date fechaAlta;
	@Column(name="FECHA_BAJA")
	private Date fechaBaja;

	public Integer getIdCardioNS() {
		return idCardioNS;
	}

	public void setIdCardioNS(Integer idCardioNS) {
		this.idCardioNS = idCardioNS;
	}

	public Integer getIdAdicional() {
		return idAdicional;
	}

	public void setIdAdicional(Integer idAdicional) {
		this.idAdicional = idAdicional;
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
