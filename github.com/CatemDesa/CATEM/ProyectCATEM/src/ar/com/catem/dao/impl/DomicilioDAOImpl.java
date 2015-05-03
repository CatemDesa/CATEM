package ar.com.catem.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import ar.com.catem.dao.DomicilioDAO;
import ar.com.catem.model.Domicilio;
import ar.com.catem.util.HibernateUtil;

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
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(Domicilio.class);
        criteria.add(Restrictions.eq(ID, idDomicilio));
        @SuppressWarnings("unchecked")
		List<Domicilio> domicilios = criteria.list();
        session.close();
		
		return domicilios.get(0);	
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
