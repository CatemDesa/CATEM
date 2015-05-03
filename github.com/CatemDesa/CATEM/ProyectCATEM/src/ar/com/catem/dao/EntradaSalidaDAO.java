package ar.com.catem.dao;

import java.util.List;

import ar.com.catem.model.Cheque;
import ar.com.catem.model.DescripcionCuenta;
import ar.com.catem.model.PagoIngresos;
import ar.com.catem.model.Rubro;
import ar.com.catem.model.Salida;

public interface EntradaSalidaDAO {
	
	// PAGO CHEQUE	
	static final String ID_PAGO_CHQ = "idPagoCheque";
	
	// PAGO INGRESO
	static final String ID_PAGO_ING = "idPagoIng";
	static final String ID_SOCIO = "idSocio";
	static final String ID_DESCR = "IDDESCRIPCION";
	static final String IMPORTE = "importe";
	static final String FECHA = "fecha";
	static final String ID_CTA_BANC = "idCuentaBancaria";
	
	// SALIDA
	static final String ID_SALIDA = "idSalida";	
	
	// CHEQUE
	static final String ID_CHQ = "idCheque";
	static final String NUMERO = "numero";
	static final String BANCO = "banco";
	
	// RUBRO
	static final String ID_UBRO = "idRubro";
	static final String DESCRIPCION = "descripcion";
	static final String TIPO_RUBRO = "tipoRubro";
	
	
	public void insertEntrada(PagoIngresos pagoIngresos) throws Exception;
	
	public void insertSalida(Salida salida) throws Exception;
	
	public void insertCheque(Cheque cheque) throws Exception;
	
	public List<Rubro> getRubros();
	
	public List<DescripcionCuenta> getCuentasContablesBy(Integer idRubro);
	
}
