package ar.com.catem.dao.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import oracle.jdbc.OracleTypes;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import ar.com.catem.dao.DomicilioDAO;
import ar.com.catem.dao.jdbc.JDBCConnection;
import ar.com.catem.model.Domicilio;
import ar.com.catem.util.HibernateUtil;
import bsch.ar.persistence.jdbc.JdbcUtils;

public class DomicilioDAOImpl implements DomicilioDAO {

	@Override
	public void insertDomicilio(Domicilio domicilio) throws Exception {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(domicilio);
        session.getTransaction().commit();
        session.close();
	}

	@Override
	public void updateDomicilio(Domicilio domicilio) throws Exception {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.update(domicilio);
        session.getTransaction().commit();
        session.close();
		
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
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(Domicilio.class);
        criteria.add(Restrictions.eq(ID, idSocio)); // TODO VER COMO HACER ESTA CONSULTA
        @SuppressWarnings("unchecked")
		List<Domicilio> domicilios = criteria.list();
        session.close();
		
		return domicilios;	
	}

}
