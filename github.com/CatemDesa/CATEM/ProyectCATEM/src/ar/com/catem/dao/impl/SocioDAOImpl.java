package ar.com.catem.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import ar.com.catem.dao.SocioDAO;
import ar.com.catem.model.Socio;
import ar.com.catem.util.HibernateUtil;

public class SocioDAOImpl extends HibernateUtil implements SocioDAO {

	@Override
	public Integer insertSocio(Socio socio) throws Exception {
				
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(socio);
        Integer id = socio.getIdSocio();
        session.getTransaction().commit();
        session.close();
		
		return id;
	}

	@Override
	public void deleteUpdateSocio(Socio socio) { // el borrado es físico, se actualiza el campo FECHA_BAJA
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.update(socio);
        session.getTransaction().commit();
        session.close();		
	}

	@Override
	public Socio getSocioBy(Integer nroSocio, String apellido, String dni) {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(Socio.class)
        .add(Restrictions.eq(NUMERO_SOCIO,nroSocio))
        .add(Restrictions.eq(APELLIDO,apellido))
        .add(Restrictions.eq(DNI,dni));
        @SuppressWarnings("unchecked")
		List<Socio> socios = criteria.list();
        session.close();
		
		return socios.get(0);
	}

}
