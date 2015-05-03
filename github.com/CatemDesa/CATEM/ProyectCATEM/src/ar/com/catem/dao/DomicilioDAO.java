package ar.com.catem.dao;

import java.util.List;

import ar.com.catem.model.Domicilio;

public interface DomicilioDAO {
	
	static final String ID = "idDomicilio";
	static final String CALLE = "calle";
	static final String NUMERO = "numero";
	static final String LOCALIDAD = "localidad";
	static final String TELEFONO = "telefono";
	static final String ID_TIPO_DOM="idTipoDomicilio";
	
	
	public void insertDomicilio(Domicilio domicilio) throws Exception;
	
	public void updateDomicilio(Domicilio domicilio) throws Exception;
	
	public Domicilio getDomicilioBy(Integer idDomicilio) throws Exception;
	
	public List<Domicilio> getDomiciliosBy(Integer idSocio);
	
}
