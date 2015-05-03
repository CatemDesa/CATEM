package ar.com.catem.controller;

import ar.com.catem.dao.impl.SocioDAOImpl;
import ar.com.catem.model.Socio;

public class SocioController {

	SocioDAOImpl socioDao;
	
	public void createNewSocio(Socio socio){
		
		socioDao = new SocioDAOImpl();
		
		try {
			Integer idSocio = socioDao.insertSocio(socio);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
