package ar.com.catem.dao;

import ar.com.catem.model.AdicionalCardio;
import ar.com.catem.model.CardioNoSocio;
import ar.com.catem.model.CardioSocio;

public interface SocioCardioDAO {

	public void insertSocioCardio(CardioNoSocio cardioNS);
	
	public void insertSocioCardio(CardioSocio cardioS);
	
	public void deleteSocioCardio(CardioNoSocio cardioNS);
	
	public void deleteSocioCardio(CardioSocio cardioS);
	
	public void insertAdicionalCardio(AdicionalCardio adicionalCardio);
	
	public void getSociosCardio();
	
	public CardioNoSocio getSocioCardioNoSocioPorPeriodo(String periodo);
	
	public CardioSocio getSocioCardioPorPeriodo(String periodo);
	
	//TODO VER QUE METODOS NECESITAMOS PARA LOS REPORTES MENSUALES Y DIARIOS
}
