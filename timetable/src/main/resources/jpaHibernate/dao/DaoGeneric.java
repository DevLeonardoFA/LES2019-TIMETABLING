package jpaHibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import jpaHibernate.util.hibernateUtil;

public class DaoGeneric<E> {

	
	
	private EntityManager em = hibernateUtil.getEntityManager();	
	
	
	public void salvarAtualizar(E entidade) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.merge(entidade);
		transaction.commit();
	}
	
	
	
	public E consultar(E entidade) {
		Object id = hibernateUtil.getPrimaryKey(entidade);
		E e = (E) em.find(entidade.getClass(), id);
	
		return e;
	}

	
	
	public void deletar(E entidade) {
		Object id = hibernateUtil.getPrimaryKey(entidade);
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.createNativeQuery("delete from " + entidade.getClass().getSimpleName() 
				+ " where id =" +id).executeUpdate();
		transaction.commit();
	}

	
	
	
	public List<E> listar(Class<E> entidade){
		List<E> lst = em.createQuery("from " +entidade.getName()).getResultList();
		
		return lst;
	}
	
	
	
	public EntityManager getEm() {
		return em;
	}
}
