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
	
}