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
@Table(name="SALIDA")
public class Salida implements Serializable{

	private static final long serialVersionUID = 1388835101889174593L;
	
	@Id
	@Column(name="IDSALIDA")
	@GeneratedValue
	private Integer idSalida;
	@Column(name="IDCUENTABANCARIA")
	private Integer idDescCuenta;
	@Column(name="FECHA")
	private Date fecha;
	@Column(name="IMPORTE")
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
