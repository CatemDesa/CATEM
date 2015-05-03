package ar.com.catem.dao;

import java.util.List;

import ar.com.catem.model.Usuario;

public interface LoginDAO {

	public List<Usuario> autenticateUser(Usuario usuario) throws Exception;
		 
	static final String ID_USUARIO = "idUsuario";
	static final String NOMBRE = "nombreUsuario";
	static final String PASSWORD = "password";
	static final String TIPO_USUARIO = "tipousuario";
	
}
