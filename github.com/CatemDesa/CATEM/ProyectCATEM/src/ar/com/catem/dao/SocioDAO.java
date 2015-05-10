package ar.com.catem.dao;

import java.util.List;

import ar.com.catem.model.EstadoCivil;
import ar.com.catem.model.Socio;
import ar.com.catem.model.TipoSocio;

public interface SocioDAO {

	static final String PACKAGE = "CATEM_SOCIO_PACKAGE";
	static final String FN_INSERT_SOCIO = ".FN_INSERT_SOCIO";
	
	
	static final String ID_SOCIO = "idSocio";
	static final String IDTIPOSOCIO = "idTipoSocio";
	static final String NUMERO_SOCIO = "nroSocio";
	static final String NOMBRE = "nombre";
	static final String APELLIDO = "apellido";
	static final String CELL = "cel";
	static final String NACIONALIDAD = "nacionalidad";
	static final String FECHA_NAC = "fechaNacimiento";
	static final String DNI = "dni";
	static final String OCUPACION = "ocupacion";
	static final String MAIL = "email";
	static final String AFAVOR = "aFavor";
	static final String IDESTADOCIVIL = "idEstadoCivil";
	
	
	public Integer insertSocio(Socio socio) throws Exception;
	
	public void deleteUpdateSocio(Socio socio);
	
	public Socio getSocioBy(Integer nroSocio, String apellido, String dni);

	List<TipoSocio> getTiposSocio();

	List<EstadoCivil> getEstados();
	
	
}
