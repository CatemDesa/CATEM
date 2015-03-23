package ar.com.catem.dao;

import ar.com.catem.model.Socio;

public interface SocioDAO {

	public void insertSocio(Socio socio);
	
	public void deleteSocio(Socio socio);
	
	public Socio getSocioBy(Integer nroSocio, String apellido, String dni);
	
	
}
