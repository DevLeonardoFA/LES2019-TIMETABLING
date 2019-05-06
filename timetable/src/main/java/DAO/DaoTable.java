package DAO;

import java.util.List;

import javax.persistence.EntityManager;

import Util.hibernateUtil;

public class DaoTable<E> {

	private EntityManager em = hibernateUtil.getEntityManager();

	public List<E> SelectTableColumn(Class<E> entidade, String coluna){
		List<E> lst = em.createQuery("Select" + coluna + "from " + entidade.getName()).getResultList();
		
		return lst;
	}
	
}