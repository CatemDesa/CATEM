package ar.com.catem.dao;

import java.util.List;

import ar.com.catem.model.Domicilio;

public interface DomicilioDAO {

	static final String PACKAGE = "";
	static final String FN_GET_DOM = "";
	
	
	public void insertDomicilio(Domicilio domicilio);
	
	public void deleteDomicilio(Domicilio domicilio);
	
	public Domicilio getDomicilioBy(Integer idDomicilio);
	
	public List<Domicilio> getDomiciliosBy(Integer idSocio);
	
}
