package ar.com.catem.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RUBRO")
public class Rubro implements Serializable{
	
	private static final long serialVersionUID = -5535422230660327834L;
	
	@Id
	@GeneratedValue
	@Column(name="IDRUBRO")
	private Integer idRubro;
	@Column(name="DESCRIPCION")
	private String descripcion;
	@Column(name="TIPORUBRO")
	private Integer salida; // 0 y 2 Entradas - 1 y 2 Salidas

	public Integer getIdRubro() {
		return idRubro;
	}

	public void setIdRubro(Integer idRubro) {
		this.idRubro = idRubro;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getSalida() {
		return salida;
	}

	public void setSalida(Integer salida) {
		this.salida = salida;
	}

}
