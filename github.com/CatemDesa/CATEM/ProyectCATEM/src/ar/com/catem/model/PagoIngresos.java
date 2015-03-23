package ar.com.catem.model;

import java.math.BigDecimal;
import java.util.Date;

public class PagoIngresos {

	private Integer idPagoIng;
	private Integer idSocio;
	private Integer idDescCuenta;
	private BigDecimal importe;
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
