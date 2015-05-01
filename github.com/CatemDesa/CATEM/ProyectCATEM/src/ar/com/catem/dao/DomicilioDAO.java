package ar.com.catem.dao;

import java.util.List;

import ar.com.catem.model.Domicilio;

public interface DomicilioDAO {

	static final String PACKAGE = "CATEM_DOMICILIO_PACKAGE";
	static final String FN_CREATE_DOM = ".FN_CREATE_DOM";
	static final String FN_GET_DOM = ".FN_GET_DOM";
	static final String FN_UPDATE_DOM = ".FN_UPDATE_DOM";
	
	static final String ID = "IDDOMICILIO";
	static final String CALLE = "CALLE";
	static final String NUMERO = "NUMERO";
	static final String LOCALIDAD = "LOCALIDAD";
	static final String TELEFONO = "TELEFONO";
	static final String ID_TIPO_DOM="IDTIPODOMICILIO";
	
	
	public void insertDomicilio(Domicilio domicilio) throws Exception;
	
	public void updateDomicilio(Domicilio domicilio) throws Exception;
	
	public Domicilio getDomicilioBy(Integer idDomicilio) throws Exception;
	
	public List<Domicilio> getDomiciliosBy(Integer idSocio);
	
}
