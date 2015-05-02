package ar.com.catem.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CHEQUE")
public class Cheque implements Serializable{

	private static final long serialVersionUID = 6288020294846399891L;
	
	@Id
	@GeneratedValue
	@Column(name="IDCHEQUE")
	private Integer idCheque;
	@Column(name="NUMERO")
	private String numero;
	@Column(name="BANCO")
	private String banco;
	@Column(name="FECHA")
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
