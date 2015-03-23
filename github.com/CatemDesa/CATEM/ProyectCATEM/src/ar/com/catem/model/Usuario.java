package ar.com.catem.model;

public class Usuario {

	private Integer idUsuario;
	private String nombreUsuario; // el usuario va a ser el mail
	private String password;
	private Integer tipousuario; // 1= admin, 2=empleado

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getTipousuario() {
		return tipousuario;
	}

	public void setTipousuario(Integer tipousuario) {
		this.tipousuario = tipousuario;
	}

}
