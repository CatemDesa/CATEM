package ar.com.catem.dao;

import ar.com.catem.model.AdicionalCardio;
import ar.com.catem.model.CardioNoSocio;
import ar.com.catem.model.CardioSocio;

public interface SocioCardioDAO {

	public static final String PACKAGE ="CATEM_SOCIO_CARDIO_PACKAGE";
	
	public static final String FN_CREATE_CARDIO_NS =".FN_CREATE_CARDIO_NS";
	public static final String FN_BAJA_CARDIO_NS = ".FN_BAJA_CARDIO_NS";
	public static final String FN_CREATE_SOCIO_CARDIO = ".FN_CREATE_SOCIO_CARDIO";
	public static final String FN_BAJA_CARDIO_SOCIO = ".FN_BAJA_CARDIO_SOCIO";
	
	// CARDIO_SOCIO
	public static final String IDSOCIOCARDIO = "IDSOCIOCARDIO";
	public static final String IDSOCIO = "IDSOCIO";
	public static final String FECHA_ALTA = "FECHA_ALTA";
	public static final String FECHA_BAJA = "FECHA_BAJA";	
	
	// CARDIO_NO_SOCIO
	public static final String IDNSOCIO = "IDNSOCIO";
	
	// ADICIONAL_CARDIO
	public static final String IDADICCARDIO = "IDADICCARDIO";
	public static final String DNI = "DNI";
	public static final String NOMBRE = "NOMBRE";
	public static final String APELLIDO = "APELLIDO";
	public static final String IDDOMICILIO = "IDDOMICILIO";		
	
	
	public void insertSocioCardio(CardioSocio cardioS);
	
	public void deleteSocioCardio(CardioSocio cardioS);	
	
	public void getSociosCardio();
	
	public CardioSocio getSocioCardioPorPeriodo(String periodo);
	
	// ADICIONALES
	
	public void insertAdicionalCardio(AdicionalCardio adicionalCardio);
	
	public void bajaAdicionalCardio(AdicionalCardio adicionalCardio);
	
	// NO SOCIOS
	
	public CardioNoSocio getSocioCardioNoSocioPorPeriodo(String periodo);
	
	public void deleteSocioCardio(CardioNoSocio cardioNS);
	
	public void insertSocioCardio(CardioNoSocio cardioNS);
	
	//TODO VER QUE METODOS NECESITAMOS PARA LOS REPORTES MENSUALES Y DIARIOS
}
