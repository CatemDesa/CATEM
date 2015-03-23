package ar.com.catem.dao;

import java.util.List;

import ar.com.catem.model.Cheque;
import ar.com.catem.model.DescripcionCuenta;
import ar.com.catem.model.PagoIngresos;
import ar.com.catem.model.Rubro;
import ar.com.catem.model.Salida;

public interface EntradaSalidaDAO {

	public void insertEntrada(PagoIngresos pagoIngresos);
	
	public void insertSalida(Salida salida);
	
	public void insertCheque(Cheque cheque);
	
	public List<Rubro> getRubros();
	
	public List<DescripcionCuenta> getCuentasContablesBy(Integer idRubro);
	
}
