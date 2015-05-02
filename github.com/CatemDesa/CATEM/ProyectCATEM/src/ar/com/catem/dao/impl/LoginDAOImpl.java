package ar.com.catem.dao.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import oracle.jdbc.OracleTypes;
import ar.com.catem.dao.LoginDAO;
import ar.com.catem.dao.jdbc.JDBCConnection;
import ar.com.catem.model.Usuario;
import bsch.ar.persistence.jdbc.JdbcUtils;

public class LoginDAOImpl implements LoginDAO{

	@Override
	public Usuario autenticateUser(Usuario usuario) throws Exception{
		Connection conn = JDBCConnection.getConnection();
        try {
        	CallableStatement callableStatement = conn.prepareCall("{? = call " +PACKAGE + FN_GET_AUTENTICATE + "}");
        	callableStatement.registerOutParameter(1, OracleTypes.CURSOR);
        	callableStatement.setString(2,usuario.getNombreUsuario());
            callableStatement.setString(3,usuario.getPassword());
					
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
	        return user;
        } catch (SQLException e) {
        	e.printStackTrace();
			throw new Exception(e.getMessage());
			
		}
		
		/*Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
        Criteria criteria = session.createCriteria(Usuario.class);
        
        criteria.add(Restrictions.eq(NOMBRE, usuario.getNombreUsuario())); 
        criteria.add(Restrictions.eq(PASSWORD, usuario.getPassword()));
        
        @SuppressWarnings("unchecked")
		List<Usuario> socios = criteria.list();
        session.close();
		
		return socios;*/
	}
	
}
