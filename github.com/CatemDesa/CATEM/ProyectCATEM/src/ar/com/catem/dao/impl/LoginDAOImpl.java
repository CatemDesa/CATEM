package ar.com.catem.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import ar.com.catem.dao.LoginDAO;
import ar.com.catem.model.Usuario;
import ar.com.catem.util.HibernateUtil;

public class LoginDAOImpl implements LoginDAO{

	@Override
	public List<Usuario> autenticateUser(Usuario usuario) throws Exception{
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
        
		Criteria criteria = session.createCriteria(Usuario.class);
        
        criteria.add(Restrictions.eq(NOMBRE, usuario.getNombreUsuario())); 
        criteria.add(Restrictions.eq(PASSWORD, usuario.getPassword()));
        
        @SuppressWarnings("unchecked")
		List<Usuario> usuarios = criteria.list();
        session.close();
        
		return usuarios;
	}
	
}
