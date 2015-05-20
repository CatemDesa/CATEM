package ar.com.catem.actions;

import java.util.Date;
import java.util.List;

import ar.com.catem.controller.SocioController;
import ar.com.catem.model.EstadoCivil;
import ar.com.catem.model.Socio;
import ar.com.catem.model.TipoSocio;

import com.opensymphony.xwork2.ActionSupport;


public class SocioAction extends ActionSupport {

	private static final long serialVersionUID = 106086586587130947L;

	private Socio socio;
	private SocioController socioController = new SocioController();

	List<EstadoCivil> estados;
	List<TipoSocio> tiposSocio;

	public String init(){
		estados = socioController.getEstados();
		tiposSocio = socioController.getTipoSocio();
		return SUCCESS;
	}
	
	@Override
	public String execute() throws Exception {
		socioController = new SocioController();
		socio.setFechaAlta(new Date());
		socioController.createNewSocio(socio);

		return SUCCESS;
	}
	
	@Override
	public void validate() {
		super.validate();
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

	public List<EstadoCivil> getEstados() {
		return estados;
	}

	public void setEstados(List<EstadoCivil> estados) {
		this.estados = estados;
	}

	public List<TipoSocio> getTiposSocio() {
		return tiposSocio;
	}

	public void setTiposSocio(List<TipoSocio> tiposSocio) {
		this.tiposSocio = tiposSocio;
	}

}
