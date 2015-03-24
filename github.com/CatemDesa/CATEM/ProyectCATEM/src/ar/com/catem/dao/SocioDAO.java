package ar.com.catem.dao;

import ar.com.catem.model.Socio;

public interface SocioDAO {

	static final String PACKAGE = "CATEM_SOCIO_PACKAGE";
	static final String FN_INSERT_SOCIO = ".FN_INSERT_SOCIO";
	static final String ID_SOCIO = "IDSOCIO";
	
	public Integer insertSocio(Socio socio) throws Exception;
	
	public void deleteSocio(Socio socio);
	
	public Socio getSocioBy(Integer nroSocio, String apellido, String dni);
	
	
}
