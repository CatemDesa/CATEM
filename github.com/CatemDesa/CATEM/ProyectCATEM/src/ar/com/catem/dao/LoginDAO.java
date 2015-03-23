package ar.com.catem.dao;

import ar.com.catem.model.Usuario;

public interface LoginDAO {

	public void autenticateUser(Usuario usuario) throws Exception;
	
	static final String PACKAGE = "CATEM_LOGIN_PACKAGE";
	static final String FN_GET_AUTENTICATE = "FN_AUTENTICATE_USER";
	 
	static final String ID_USUARIO = "";
	static final String NOMBRE = "";
	static final String PASSWORD = "";
	static final String TIPO_USUARIO = "";
	static final String TEL_PARTICULAR = "";
	static final String TEL_PERSONAL = "";
	
}
