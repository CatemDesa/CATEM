package ar.com.catem.model;

import java.util.Date;

public class CardioSocio {

	private Integer idCardioSocio;
	private Integer idSocio;
	private Date fechaAlta;
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
