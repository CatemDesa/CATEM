package ar.com.catem.controller;

import java.util.List;

import ar.com.catem.dao.LoginDAO;
import ar.com.catem.dao.impl.LoginDAOImpl;
import ar.com.catem.model.Usuario;

public class LoginController {

	LoginDAO loginDAO = new LoginDAOImpl();
	
	public Usuario autenticateUsuario(Usuario user) throws Exception
	{
		try {			
			List<Usuario> usuario = loginDAO.autenticateUser(user);
			if(usuario != null){
				return usuario.get(0);
			}else{
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
	}
	
}
