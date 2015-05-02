package ar.com.catem.dao;

import ar.com.catem.model.Socio;

public interface SocioDAO {

	static final String PACKAGE = "CATEM_SOCIO_PACKAGE";
	static final String FN_INSERT_SOCIO = ".FN_INSERT_SOCIO";
	
	
	static final String ID_SOCIO = "IDSOCIO";
	static final String IDTIPOSOCIO = "IDTIPOSOCIO";
	static final String NUMERO_SOCIO = "NUMERO_SOCIO";
	static final String NOMBRE = "NOMBRE";
	static final String APELLIDO = "APELLIDO";
	static final String CELL = "CELL";
	static final String NACIONALIDAD = "NACIONALIDAD";
	static final String FECHA_NAC = "FECHA_NAC";
	static final String DNI = "DNI";
	static final String OCUPACION = "OCUPACION";
	static final String MAIL = "MAIL";
	static final String AFAVOR = "AFAVOR";
	static final String IDESTADOCIVIL = "IDESTADOCIVIL";
	
	
	public Integer insertSocio(Socio socio) throws Exception;
	
	public void deleteUpdateSocio(Socio socio);
	
	public Socio getSocioBy(Integer nroSocio, String apellido, String dni);
	
	
}
