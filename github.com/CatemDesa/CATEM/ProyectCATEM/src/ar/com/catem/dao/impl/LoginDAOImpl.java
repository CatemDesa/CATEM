package ar.com.catem.dao.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.OracleTypes;
import bsch.ar.persistence.jdbc.JdbcUtils;
import ar.com.catem.dao.LoginDAO;
import ar.com.catem.dao.jdbc.JDBCConnection;
import ar.com.catem.model.Usuario;

public class LoginDAOImpl implements LoginDAO{

	@Override
	public void autenticateUser(Usuario usuario) throws Exception{
		Connection conn = JDBCConnection.getConnection();
        try {
        	CallableStatement callableStatement = conn.prepareCall(FN_GET_AUTENTICATE);
            callableStatement.setString(2,usuario.getNombreUsuario());
            callableStatement.setString(3,usuario.getPassword());
			callableStatement.registerOutParameter(1, OracleTypes.CURSOR);		
			callableStatement.executeUpdate();
			ResultSet rs = (ResultSet) callableStatement.getObject(1);
	        Usuario user = null;
	        while(rs.next()){
	          user = new Usuario();
	          user.setIdUsuario(JdbcUtils.getIntObject(rs, ID_USUARIO));
	          user.setNombreUsuario(JdbcUtils.getString(rs, NOMBRE));
	          user.setPassword(JdbcUtils.getString(rs, PASSWORD));
	          user.setTipousuario(JdbcUtils.getIntObject(rs, TIPO_USUARIO));
	        }
	        rs.close();
        } catch (SQLException e) {
			throw new Exception(e.getMessage());
		}
	}
	
}
