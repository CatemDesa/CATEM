package ar.com.catem.model;

import java.math.BigDecimal;
import java.util.Date;

public class Salida {

	private Integer idSalida;
	private Integer idDescCuenta;
	private Date fecha;
	private BigDecimal importe;

	public Integer getIdSalida() {
		return idSalida;
	}

	public void setIdSalida(Integer idSalida) {
		this.idSalida = idSalida;
	}

	public Integer getIdDescCuenta() {
		return idDescCuenta;
	}

	public void setIdDescCuenta(Integer idDescCuenta) {
		this.idDescCuenta = idDescCuenta;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getImporte() {
		return importe;
	}

	public void setImporte(BigDecimal importe) {
		this.importe = importe;
	}

}
