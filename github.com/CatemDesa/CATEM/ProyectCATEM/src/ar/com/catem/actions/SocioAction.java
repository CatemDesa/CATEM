package ar.com.catem.actions;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ar.com.catem.controller.SocioController;
import ar.com.catem.model.Socio;

import com.opensymphony.xwork2.ActionSupport;

public class SocioAction extends ActionSupport {

	private static final long serialVersionUID = 106086586587130947L;

	private List<String> tipoSocio;
	private List<String> estadoCivil;

	private String tipoDeSocio;
	
	private Socio socio;
	
	private SocioController socioController;

	private static final String PARTICULAR = "Particular";
	private static final String COMERCIAL = "Comercial";
	private static final String PROFESIONAL = "Profesional";
	
	private static final String SOLTERO = "Soltero";
	private static final String CASADO = "Casado";
	private static final String DIVORCIADO = "Divorciado";
	private static final String VIUDO = "Viudo";
	;

	@Override
	public String execute() throws Exception {
		// acá llenas los combos y demas cosas necesarias, EJ.: Combo de Estado
		// Civil, Tipo de Socio, etc.
		fillTipoSocio();
		fillEstadoCivil();
		return SUCCESS;
	}

	
	public String confirmNewSocio(){
		socioController = new SocioController();
		if(PARTICULAR.equals(tipoDeSocio)){
			socio.setIdTipoSocio(1);
		}
		socio.setFechaAlta(new Date());
		socioController.createNewSocio(socio);		
		
		return SUCCESS;
	}
	
	public List<String> getEstadoCivil() {
		return estadoCivil;
	}


	public void setEstadoCivil(List<String> estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getDefaultEstadoValue() {
		return SOLTERO;
	}

	// Constructor que carga el radiobutton
	private void fillTipoSocio() {

		tipoSocio = new ArrayList<String>();
		tipoSocio.add(PARTICULAR);
		tipoSocio.add(COMERCIAL);
		tipoSocio.add(PROFESIONAL);
	}
	
	private void fillEstadoCivil() {

		estadoCivil = new ArrayList<String>();
		estadoCivil.add(SOLTERO);
		estadoCivil.add(CASADO);
		estadoCivil.add(DIVORCIADO);
		estadoCivil.add(VIUDO);
	}

	// return por default tipo de socio particular
	public String getDefaultTipoValue() {
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


	public Socio getSocio() {
		return socio;
	}


	public void setSocio(Socio socio) {
		this.socio = socio;
	}


	public SocioController getSocioController() {
		return socioController;
	}


	public void setSocioController(SocioController socioController) {
		this.socioController = socioController;
	}

}
