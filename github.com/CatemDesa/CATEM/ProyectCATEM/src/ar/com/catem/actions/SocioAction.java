package ar.com.catem.actions;

import com.opensymphony.xwork2.ActionSupport;

public class SocioAction extends ActionSupport {

	private static final long serialVersionUID = 106086586587130947L;

	@Override
	public String execute() throws Exception {
		
		/* TEST ALTA DE SOCIO*/
		/*
		SocioDAOImpl socioDaoImpl = new SocioDAOImpl();
		Socio socio = new Socio();
		socio.setApellido("rua");
		socio.setNombre("sharon");
		socio.setCel("1553443033");
		socio.setEmail("sharoninia.sr@gmail.com");
		socio.setFechaNacimiento(new Date());
		socio.setFechaAlta(new Date());
		socio.setDni("35629852");
		socio.setIdEstadoCivil(0);
		socio.setIdTipoSocio(2);
		socio.setNacionalidad("Argentina");
		socio.setOcupacion("Desarrollador");
		socio.setNroSocio("00000001");
		
		socioDaoImpl.insertSocio(socio);
		*/
		
		// acá llenas los combos y demas cosas necesarias, EJ.: Combo de Estado Civil, Tipo de Socio, etc.
		
		return SUCCESS;
	}
	
}
