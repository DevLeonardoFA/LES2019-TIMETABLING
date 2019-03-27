package DAO;

import java.util.List;

import javax.persistence.EntityManager;

import Util.hibernateUtil;

public class DaoList<E> {

	private EntityManager em = hibernateUtil.getEntityManager();
	
	public List<E> listarNomes(String select,Class<E> entidade){
		
		List<E> lstname = em.createQuery("select" + select + "from " + entidade.getName()).getResultList();
		
		return lstname;
	}
	
}
