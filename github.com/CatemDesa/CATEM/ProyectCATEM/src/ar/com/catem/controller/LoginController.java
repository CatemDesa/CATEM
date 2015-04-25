package ar.com.catem.controller;

import ar.com.catem.dao.LoginDAO;
import ar.com.catem.dao.impl.LoginDAOImpl;
import ar.com.catem.model.Usuario;

public class LoginController {

	LoginDAO loginDAO = new LoginDAOImpl();
	
	public Usuario autenticateUsuario(Usuario user) throws Exception
	{
		try {
			return loginDAO.autenticateUser(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception(e);
		}
	}
	
}
