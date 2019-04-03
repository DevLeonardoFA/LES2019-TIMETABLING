package DAO;

import java.util.List;

import javax.persistence.EntityManager;

import Util.hibernateUtil;

public class DaoList<E> {

	private EntityManager em = hibernateUtil.getEntityManager();
	
	public List<E> listarNome(Class<E> entidade){
		List<E> lst = em.createQuery("Select name from " + entidade.getName()).getResultList();
		
		return lst;
	}
	
}
