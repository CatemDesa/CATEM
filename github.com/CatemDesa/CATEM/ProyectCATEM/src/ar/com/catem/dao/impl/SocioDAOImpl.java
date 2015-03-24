package ar.com.catem.dao.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;

import oracle.jdbc.OracleTypes;
import ar.com.catem.dao.SocioDAO;
import ar.com.catem.dao.jdbc.JDBCConnection;
import ar.com.catem.model.Socio;

public class SocioDAOImpl implements SocioDAO {

	@Override
	public Integer insertSocio(Socio socio) throws Exception {
		Connection conn = JDBCConnection.getConnection();
        try {
        	CallableStatement callableStatement = conn.prepareCall(PACKAGE + FN_INSERT_SOCIO);
            callableStatement.setString(2,socio.getApellido());
            callableStatement.setString(3,socio.getNombre());
            callableStatement.setString(4,socio.getNroSocio());
            callableStatement.setInt(5,socio.getIdTipoSocio());
            callableStatement.setString(6,socio.getNacionalidad());
            callableStatement.setInt(7,socio.getIdEstadoCivil());
            callableStatement.setDate(8,new Date(socio.getFechaNacimiento().getTime()));
            callableStatement.setString(9,socio.getDni());
            callableStatement.setString(10,socio.getOcupacion());
            callableStatement.setString(11,socio.getEmail());
            callableStatement.setBigDecimal(12,socio.getaFavor());
			callableStatement.registerOutParameter(1, OracleTypes.NUMBER);		
			callableStatement.executeUpdate();
			return (Integer) callableStatement.getObject(1);
        } catch (SQLException e) {
			throw new Exception(e.getMessage());
		}
		
	}

	@Override
	public void deleteSocio(Socio socio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Socio getSocioBy(Integer nroSocio, String apellido, String dni) {
		// TODO Auto-generated method stub
		return null;
	}

}
