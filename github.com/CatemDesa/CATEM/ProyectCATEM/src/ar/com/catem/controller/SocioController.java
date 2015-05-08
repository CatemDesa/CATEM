package ar.com.catem.controller;

import java.util.List;

import ar.com.catem.dao.impl.SocioDAOImpl;
import ar.com.catem.model.EstadoCivil;
import ar.com.catem.model.Socio;
import ar.com.catem.model.TipoSocio;

public class SocioController {

	
	SocioDAOImpl socioDao = new SocioDAOImpl();
	
	public void createNewSocio(Socio socio){
		
		socioDao = new SocioDAOImpl();
		
		try {
			Integer idSocio = socioDao.insertSocio(socio);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<EstadoCivil> getEstados(){		
		return socioDao.getEstados();
	}
	
	public List<TipoSocio> getTipoSocio(){
		return socioDao.getTiposSocio();
	}
}
