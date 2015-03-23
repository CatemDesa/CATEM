package ar.com.catem.model;

import java.util.Date;

public class CardioNoSocio {

	private Integer idCardioNS;
	private Integer idAdicional;
	private Date fechaAlta;
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
