package ar.com.catem.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUENTA_BANCARIA")
public class DescripcionCuenta implements Serializable{

	private static final long serialVersionUID = 8049628037264251287L;
	
	@Id
	@GeneratedValue
	@Column(name="IDCUENTABANCARIA")
	private Integer idDescCuenta;
	@Column(name="DESCRIPCION")
	private String descripcion;
	@Column(name="IDRUBRO")
	private Integer idRubro;

	public Integer getIdDescCuenta() {
		return idDescCuenta;
	}

	public void setIdDescCuenta(Integer idDescCuenta) {
		this.idDescCuenta = idDescCuenta;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getIdRubro() {
		return idRubro;
	}

	public void setIdRubro(Integer idRubro) {
		this.idRubro = idRubro;
	}

}
