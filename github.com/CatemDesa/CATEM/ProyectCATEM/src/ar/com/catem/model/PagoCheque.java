package ar.com.catem.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PAGO_CHEQUE")
public class PagoCheque implements Serializable{

	private static final long serialVersionUID = 7081364252344772369L;
	
	@Id
	@GeneratedValue
	@Column(name="IDPAGOCHEQUE")
	private Integer idPagoCheque;
	@Column(name="IDPAGOING")
	private Integer idPagoIng;
	@Column(name="IDCHEQUE")
	private Integer idCheque;

	public Integer getIdPagoCheque() {
		return idPagoCheque;
	}

	public void setIdPagoCheque(Integer idPagoCheque) {
		this.idPagoCheque = idPagoCheque;
	}

	public Integer getIdPagoIng() {
		return idPagoIng;
	}

	public void setIdPagoIng(Integer idPagoIng) {
		this.idPagoIng = idPagoIng;
	}

	public Integer getIdCheque() {
		return idCheque;
	}

	public void setIdCheque(Integer idCheque) {
		this.idCheque = idCheque;
	}

}
