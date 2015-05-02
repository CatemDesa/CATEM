package ar.com.catem.dao;

import java.util.List;

import ar.com.catem.model.Cheque;
import ar.com.catem.model.DescripcionCuenta;
import ar.com.catem.model.PagoIngresos;
import ar.com.catem.model.Rubro;
import ar.com.catem.model.Salida;

public interface EntradaSalidaDAO {


	static final String PACKAGE_ENTRADA = "CATEM_ENTRADA_PACKAGE";
	static final String PACKAGE_SALIDA = "CATEM_SALIDA_PACKAGE";
	
	static final String FN_INSERT_CHQ = ".FN_CREATE_CHQ";
	static final String FN_CREATE_PAGO_CHQ = ".FN_CREATE_PAGO_CHQ"; 
	static final String FN_CREATE_PAGO_ING = ".FN_CREATE_PAGO_ING";
	
	static final String FN_CREATE_SALIDA = ".FN_CREATE_SALIDA";
	
	// PAGO CHEQUE	
	static final String ID_PAGO_CHQ = "IDPAGOCHEQUE";
	
	// PAGO INGRESO
	static final String ID_PAGO_ING = "IDPAGOING";
	static final String ID_SOCIO = "IDSOCIO";
	static final String ID_DESCR = "IDDESCRIPCION";
	static final String IMPORTE = "IMPORTE";
	static final String FECHA = "FECHA";
	static final String ID_CTA_BANC = "IDCUENTABANCARIA";
	
	// SALIDA
	static final String ID_SALIDA = "IDSALIDA";	
	
	// CHEQUE
	static final String ID_CHQ = "IDCHEQUE";
	static final String NUMERO = "NUMERO";
	static final String BANCO = "BANCO";
	
	// RUBRO
	static final String ID_UBRO = "IDRUBRO";
	static final String DESCRIPCION = "DESCRIPCION";
	static final String TIPO_RUBRO = "TIPORUBRO";
	
	
	public void insertEntrada(PagoIngresos pagoIngresos) throws Exception;
	
	public void insertSalida(Salida salida) throws Exception;
	
	public void insertCheque(Cheque cheque) throws Exception;
	
	public List<Rubro> getRubros();
	
	public List<DescripcionCuenta> getCuentasContablesBy(Integer idRubro);
	
}
