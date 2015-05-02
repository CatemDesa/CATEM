package ar.com.catem.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PAGO_INGRESO")
public class PagoIngresos implements Serializable{

	private static final long serialVersionUID = -7189708020637827854L;
	
	@Id
	@GeneratedValue
	@Column(name="IDPAGOING")
	private Integer idPagoIng;
	@Column(name="IDSOCIO")
	private Integer idSocio;
	@Column(name="IDCUENTABANCARIA")
	private Integer idDescCuenta;
	@Column(name="IMPORTE")
	private BigDecimal importe;
	@Column(name="FECHA")
	private Date fecha;

	public Integer getIdPagoIng() {
		return idPagoIng;
	}

	public void setIdPagoIng(Integer idPagoIng) {
		this.idPagoIng = idPagoIng;
	}

	public Integer getIdSocio() {
		return idSocio;
	}

	public void setIdSocio(Integer idSocio) {
		this.idSocio = idSocio;
	}

	public Integer getIdDescCuenta() {
		return idDescCuenta;
	}

	public void setIdDescCuenta(Integer idDescCuenta) {
		this.idDescCuenta = idDescCuenta;
	}

	public BigDecimal getImporte() {
		return importe;
	}

	public void setImporte(BigDecimal importe) {
		this.importe = importe;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}
