package ar.com.catem.model;

import java.util.Date;

public class Cheque {

	private Integer idCheque;
	private String numero;
	private String banco;
	private Date fecha;

	public Integer getIdCheque() {
		return idCheque;
	}

	public void setIdCheque(Integer idCheque) {
		this.idCheque = idCheque;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}
