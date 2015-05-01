package ar.com.catem.dao.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import oracle.jdbc.OracleTypes;
import ar.com.catem.dao.DomicilioDAO;
import ar.com.catem.dao.jdbc.JDBCConnection;
import ar.com.catem.model.Domicilio;
import bsch.ar.persistence.jdbc.JdbcUtils;

public class DomicilioDAOImpl implements DomicilioDAO {

	@Override
	public void insertDomicilio(Domicilio domicilio) throws Exception {
		Connection conn = JDBCConnection.getConnection();
        try {
        	CallableStatement callableStatement = conn.prepareCall("{? = call " + PACKAGE + FN_CREATE_DOM + "}");
            callableStatement.setString(2,domicilio.getCalle());
            callableStatement.setString(3,domicilio.getNumero());
            callableStatement.setString(4,domicilio.getLocalidad());
            callableStatement.setString(5,domicilio.getTelefono());
            callableStatement.setInt(6,domicilio.getIdTipoDomicilio());
			callableStatement.registerOutParameter(1, OracleTypes.NUMBER);		
			callableStatement.executeUpdate();
			Integer result = (Integer) callableStatement.getObject(1);
			if(result == 0){
				// todo ok
			}else{
				// error
			}
        } catch (SQLException e) {
			throw new Exception(e.getMessage());
		}
		
	}

	@Override
	public void updateDomicilio(Domicilio domicilio) throws Exception {
		Connection conn = JDBCConnection.getConnection();
        try {
        	CallableStatement callableStatement = conn.prepareCall("{? = call " + PACKAGE + FN_UPDATE_DOM + "}");
        	callableStatement.setInt(2,domicilio.getIdDomicilio());
        	callableStatement.setString(3,domicilio.getCalle());
            callableStatement.setString(4,domicilio.getNumero());
            callableStatement.setString(5,domicilio.getLocalidad());
            callableStatement.setString(6,domicilio.getTelefono());
            callableStatement.setInt(7,domicilio.getIdTipoDomicilio());
			callableStatement.registerOutParameter(1, OracleTypes.NUMBER);		
			callableStatement.executeUpdate();
			Integer result = (Integer) callableStatement.getObject(1);
			if(result == 0){
				// todo ok
			}else{
				// error
			}
        } catch (SQLException e) {
			throw new Exception(e.getMessage());
		}
		
	}
	
	@Override
	public Domicilio getDomicilioBy(Integer idDomicilio) throws Exception {
		
		Connection conn = JDBCConnection.getConnection();
        try {
        	CallableStatement callableStatement = conn.prepareCall("{? = call " + PACKAGE + FN_GET_DOM + "}");
        	callableStatement.setInt(2,idDomicilio);
			callableStatement.registerOutParameter(1, OracleTypes.CURSOR);		
			callableStatement.executeUpdate();
			ResultSet rs = (ResultSet) callableStatement.getObject(1);
	        Domicilio dom = null;
	        while(rs.next()){
	          dom = new Domicilio();
	          dom.setCalle(JdbcUtils.getString(rs, CALLE));
	          dom.setNumero(JdbcUtils.getString(rs, NUMERO));
	          dom.setLocalidad(JdbcUtils.getString(rs, LOCALIDAD));
	          dom.setTelefono(JdbcUtils.getString(rs, TELEFONO));
	          dom.setIdTipoDomicilio(JdbcUtils.getIntObject(rs, ID_TIPO_DOM));
	          dom.setIdDomicilio(JdbcUtils.getIntObject(rs, ID));
	        }
	        rs.close();
			return dom;
        } catch (SQLException e) {
			throw new Exception(e.getMessage());
		}	
	}

	@Override
	public List<Domicilio> getDomiciliosBy(Integer idSocio) {		

		return null;	
	}

}
