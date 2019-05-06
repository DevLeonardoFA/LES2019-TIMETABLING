package DAO;

import java.util.List;

import javax.persistence.EntityManager;

import Util.hibernateUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Curso;

public class DaoList<E> {

	private EntityManager em = hibernateUtil.getEntityManager();
	
	public List<E> listar(Class<E> entidade, String val){
		List<E> lst = em.createQuery("Select "+ val +" from " + entidade.getName()).getResultList();
		
		return lst;
	}
	
	public List ListAll(Class entidade,String where) {
		List lst = em.createQuery("Select name from " + entidade.getName() + " where curso = '" + where + "' ").getResultList();
		
		return lst;
	}
	
}
