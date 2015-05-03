package ar.com.catem.dao;

import java.util.List;

import ar.com.catem.model.AdicionalCardio;
import ar.com.catem.model.CardioNoSocio;
import ar.com.catem.model.CardioSocio;

public interface SocioCardioDAO {
	
	// CARDIO_SOCIO
	public static final String IDSOCIOCARDIO = "idCardioSocio";
	public static final String IDSOCIO = "idSocio";
	public static final String FECHA_ALTA = "fechaAlta";
	public static final String FECHA_BAJA = "fechaBaja";	
	
	// CARDIO_NO_SOCIO
	public static final String IDNSOCIO = "idCardioNS";
	
	// ADICIONAL_CARDIO
	public static final String IDADICCARDIO = "idAdic";
	public static final String DNI = "dni";
	public static final String NOMBRE = "nombre";
	public static final String APELLIDO = "apellido";
	public static final String IDDOMICILIO = "idDomicilio";		
	
	
	public void insertSocioCardio(CardioSocio cardioS);
	
	public void deleteUpdateSocioCardio(CardioSocio cardioS);	
	
	public List<CardioSocio> getSociosCardio();
	
	public List<CardioSocio> getSociosCardioPorPeriodo(String periodo);
	
	// ADICIONALES
	
	public void insertAdicionalCardio(AdicionalCardio adicionalCardio);
	
	public void deleteUpdateAdicionalCardio(AdicionalCardio adicionalCardio);
	
	// NO SOCIOS
	
	public List<CardioNoSocio> getSociosCardioNoSocioPorPeriodo(String periodo);
	
	public void deleteUpdateSocioCardio(CardioNoSocio cardioNS);
	
	public void insertSocioCardio(CardioNoSocio cardioNS);
	
	//TODO VER QUE METODOS NECESITAMOS PARA LOS REPORTES MENSUALES Y DIARIOS
}
