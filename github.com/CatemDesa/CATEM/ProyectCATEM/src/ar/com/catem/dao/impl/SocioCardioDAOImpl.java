package ar.com.catem.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import ar.com.catem.dao.SocioCardioDAO;
import ar.com.catem.model.AdicionalCardio;
import ar.com.catem.model.CardioNoSocio;
import ar.com.catem.model.CardioSocio;
import ar.com.catem.util.HibernateUtil;

public class SocioCardioDAOImpl implements SocioCardioDAO {

	@Override
	public void insertSocioCardio(CardioSocio cardioS) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(cardioS);
        session.getTransaction().commit();
        session.close();		
	}

	@Override
	public void deleteUpdateSocioCardio(CardioSocio cardioS) { // la baja es lógica, se actualiza FECHA_BAJA
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.update(cardioS);
        session.getTransaction().commit();
        session.close();		
	}

	@Override
	public List<CardioSocio> getSociosCardio() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(CardioSocio.class);
        /*
        criteria.add(Restrictions.eq(APELLIDO,apellido));
        criteria.add(Restrictions.eq(DNI,dni));
        */
        @SuppressWarnings("unchecked")
		List<CardioSocio> socios = criteria.list();
        session.close();
		
		return socios;
	}

	@Override
	public List<CardioSocio> getSociosCardioPorPeriodo(String periodo) {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(CardioSocio.class);
        
        criteria.add(Restrictions.between(FECHA_ALTA,periodo,periodo)); // TODO VER BIEN COMO HACER ESTA CONSULTA
        
        @SuppressWarnings("unchecked")
		List<CardioSocio> socios = criteria.list();
        session.close();
		
		return socios;
	}

	@Override
	public void insertAdicionalCardio(AdicionalCardio adicionalCardio) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(adicionalCardio);
        session.getTransaction().commit();
        session.close();		
	}

	@Override
	public void deleteUpdateAdicionalCardio(AdicionalCardio adicionalCardio) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.update(adicionalCardio);
        session.getTransaction().commit();
        session.close();		
	}

	@Override
	public List<CardioNoSocio> getSociosCardioNoSocioPorPeriodo(String periodo) {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(CardioNoSocio.class);
        
        criteria.add(Restrictions.between(FECHA_ALTA,periodo,periodo)); // TODO VER BIEN COMO HACER ESTA CONSULTA
        
        @SuppressWarnings("unchecked")
		List<CardioNoSocio> sociosCardio = criteria.list();
        session.close();
		
		return sociosCardio;
	}

	@Override
	public void deleteUpdateSocioCardio(CardioNoSocio cardioNS) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.update(cardioNS);
        session.getTransaction().commit();
        session.close();		
	}

	@Override
	public void insertSocioCardio(CardioNoSocio cardioNS) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(cardioNS);
        session.getTransaction().commit();
        session.close();
	}

	

}
