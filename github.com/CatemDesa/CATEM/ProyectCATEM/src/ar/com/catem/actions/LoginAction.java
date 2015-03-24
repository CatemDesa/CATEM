package ar.com.catem.actions;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2658561757488414192L;
	private String username;
	private String password;

	@Override
	public String execute() throws Exception {

		//return super.execute();
		if(username.length()<1)
		{addFieldError("username", "Verifique el nombre de usuario");
		return ERROR;
		}
		if(password.length()<1)
		{addFieldError("password", "Verifique la contraseña");
		return ERROR;
		}
		else {return SUCCESS;}
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
