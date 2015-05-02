package ar.com.catem.dao.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import oracle.jdbc.OracleTypes;
import ar.com.catem.dao.EntradaSalidaDAO;
import ar.com.catem.dao.jdbc.JDBCConnection;
import ar.com.catem.model.Cheque;
import ar.com.catem.model.DescripcionCuenta;
import ar.com.catem.model.PagoIngresos;
import ar.com.catem.model.Rubro;
import ar.com.catem.model.Salida;

public class EntradaSalidaDAOImpl implements EntradaSalidaDAO {

	@Override
	public void insertEntrada(PagoIngresos pagoIngresos) throws Exception {
		
		Connection conn = JDBCConnection.getConnection();
        try {
        	CallableStatement callableStatement = conn.prepareCall("{? = call " + PACKAGE_ENTRADA + FN_CREATE_PAGO_ING + "}");
            callableStatement.setInt(2,pagoIngresos.getIdSocio());
            callableStatement.setBigDecimal(3, null); //TODO PORQUE ESPERA ID_DESCRIPCION??
            callableStatement.setBigDecimal(4, pagoIngresos.getImporte());
            callableStatement.setDate(5,new Date(pagoIngresos.getFecha().getTime()));
            callableStatement.setInt(6,pagoIngresos.getIdDescCuenta());
			callableStatement.registerOutParameter(1, OracleTypes.NUMBER);		
			callableStatement.executeUpdate();
			Integer result = (Integer) callableStatement.getObject(1);
			if(result != -1){
				// todo ok
			}else{
				// error
			}
        } catch (SQLException e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public void insertSalida(Salida salida) throws Exception {
		
		Connection conn = JDBCConnection.getConnection();
        try {
        	CallableStatement callableStatement = conn.prepareCall("{? = call " + PACKAGE_SALIDA + FN_CREATE_SALIDA + "}");
            callableStatement.setInt(2, 0); //TODO PORQUE ESPERA ID_DESCRIPCION??
            callableStatement.setDate(3, new Date(salida.getFecha().getTime()));
            callableStatement.setInt(1, salida.getIdDescCuenta());
            
			callableStatement.registerOutParameter(1, OracleTypes.NUMBER);		
			callableStatement.executeUpdate();
			Integer result = (Integer) callableStatement.getObject(1);
			if(result != -1){
				// todo ok
			}else{
				// error
			}
        } catch (SQLException e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public void insertCheque(Cheque cheque) throws Exception {
		Connection conn = JDBCConnection.getConnection();
        try {
        	CallableStatement callableStatement = conn.prepareCall("{? = call " + PACKAGE_ENTRADA + FN_INSERT_CHQ + "}");
            callableStatement.setString(2, cheque.getNumero());
            callableStatement.setString(3, cheque.getBanco());
            callableStatement.setDate(4,new Date(cheque.getFecha().getTime()));
			callableStatement.registerOutParameter(1, OracleTypes.NUMBER);		
			callableStatement.executeUpdate();
			Integer result = (Integer) callableStatement.getObject(1);
			if(result != -1){
				// todo ok
			}else{
				// error
			}
        } catch (SQLException e) {
			throw new Exception(e.getMessage());
		}	
	}

	@Override
	public List<Rubro> getRubros() {
		
		return null;
	}

	@Override
	public List<DescripcionCuenta> getCuentasContablesBy(Integer idRubro) {
		
		return null;
	}

}
