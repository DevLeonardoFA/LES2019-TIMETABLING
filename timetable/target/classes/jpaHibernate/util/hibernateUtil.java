
  
package jpaHibernate.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class hibernateUtil {

	public static EntityManagerFactory factory = null;

	static {
		init();
	}

	private static void init() {
		try {
			if (factory == null) {
				factory = Persistence.createEntityManagerFactory("TimeTab");

			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public static EntityManager getEntityManager() {
		return factory.createEntityManager(); // Prove a parte de persistência
	}
	
	public static Object getPrimaryKey(Object entidade) {
		return factory.getPersistenceUnitUtil().getIdentifier(entidade);
	}
}