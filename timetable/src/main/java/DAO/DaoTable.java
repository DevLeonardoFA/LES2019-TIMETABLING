package DAO;

import java.util.List;

import javax.persistence.EntityManager;

import Util.hibernateUtil;

public class DaoTable<E> {

	private EntityManager em = hibernateUtil.getEntityManager();

	public List<E> list(Class<E> entidade){
		List<E> lst = em.createQuery("from " + entidade.getName()).getResultList();
		
		return lst;
	}
	
	public List<E> listEsp(E entidade){
		Object id = hibernateUtil.getPrimaryKey(entidade);
		List<E> lst = em.createQuery("from " + entidade.getClass().getSimpleName() 
				+ " Where id = " + id).getResultList();
		return lst;
	}
	
}