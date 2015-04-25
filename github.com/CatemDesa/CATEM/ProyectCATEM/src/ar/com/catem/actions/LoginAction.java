package ar.com.catem.actions;

import ar.com.catem.controller.LoginController;
import ar.com.catem.model.Usuario;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 2658561757488414192L;
	
	private String username;
	private String password;
	private LoginController loginController;

	@Override
	public String execute() throws Exception {
		
		loginController = new LoginController();
		Usuario user = new Usuario();
		user.setNombreUsuario(username);
		user.setPassword(password);
		user = loginController.autenticateUsuario(user);

		if (user == null) {
			return ERROR;
		} else {
			return SUCCESS;
		}

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
