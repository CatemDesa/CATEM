package ar.com.catem.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import ar.com.catem.dao.EntradaSalidaDAO;
import ar.com.catem.model.Cheque;
import ar.com.catem.model.DescripcionCuenta;
import ar.com.catem.model.PagoIngresos;
import ar.com.catem.model.Rubro;
import ar.com.catem.model.Salida;
import ar.com.catem.util.HibernateUtil;

public class EntradaSalidaDAOImpl implements EntradaSalidaDAO {

	@Override
	public void insertEntrada(PagoIngresos pagoIngresos) throws Exception {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(pagoIngresos);
        session.getTransaction().commit();
        session.close();
	}

	@Override
	public void insertSalida(Salida salida) throws Exception {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(salida);
        session.getTransaction().commit();
        session.close();
	}

	@Override
	public void insertCheque(Cheque cheque) throws Exception {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(cheque);
        session.getTransaction().commit();
        session.close();
	}

	@Override
	public List<Rubro> getRubros() {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(Rubro.class);        
        @SuppressWarnings("unchecked")
		List<Rubro> rubros = criteria.list();
        session.close();
		
		return rubros;
	}

	@Override
	public List<DescripcionCuenta> getCuentasContablesBy(Integer idRubro) {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(DescripcionCuenta.class);
        criteria.add(Restrictions.eq(ID_UBRO, idRubro));
        @SuppressWarnings("unchecked")
		List<DescripcionCuenta> descCtas = criteria.list();
        session.close();
		
		return descCtas;
	}

}
