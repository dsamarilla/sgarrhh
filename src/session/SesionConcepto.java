package session;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Concepto;

public class SesionConcepto {
	
private EntityManagerFactory emf = null;
	
	public SesionConcepto() {
		emf = Persistence.createEntityManagerFactory("UnitSgrrhh_db");
	}

	public EntityManager getEntityManager() {
		return emf.createEntityManager();
	}

	public void insertar(Concepto emp) throws Exception {
		EntityManager em = getEntityManager();
		try {			
			em.getTransaction().begin();
			em.persist(emp);
			em.getTransaction().commit();
		} catch (Exception ex) {
			throw new Exception(ex);
		} finally {
			if (em != null) {
				em.close();
			}
		}
	}
	

}
