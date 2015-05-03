package ar.com.catem.actions;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class SocioAction extends ActionSupport {

	private static final long serialVersionUID = 106086586587130947L;
	
	private List<String> tipoSocio;
	
	private String tipoDeSocio;
	
	private static final String PARTICULAR = "Particular";
	private static final String COMERCIAL = "Comercial";
	private static final String PROFESIONAL = "Profesional";
	
	
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
		
		// ac� llenas los combos y demas cosas necesarias, EJ.: Combo de Estado Civil, Tipo de Socio, etc.
		
		return SUCCESS;
	}
	
	
	//Constructor que carga el radiobutton
	public SocioAction(){
		 
		tipoSocio = new ArrayList<String>();
		tipoSocio.add(PARTICULAR);
		tipoSocio.add(COMERCIAL);
		tipoSocio.add(PROFESIONAL);
		}
	
	//return por default tipo de socio particular
		public String getDefaultTipoValue(){
			return PARTICULAR;
		}


		public List<String> getTipoSocio() {
			return tipoSocio;
		}


		public void setTipoSocio(List<String> tipoSocio) {
			this.tipoSocio = tipoSocio;
		}


		public String getTipoDeSocio() {
			return tipoDeSocio;
		}


		public void setTipoDeSocio(String tipoDeSocio) {
			this.tipoDeSocio = tipoDeSocio;
		}
	
}
