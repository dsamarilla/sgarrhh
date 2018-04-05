package session;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.TipoDocumento;

public class SesionTipoDocumento {
	
private EntityManagerFactory emf = null;
	
	public SesionTipoDocumento() {
		emf = Persistence.createEntityManagerFactory("UnitSgrrhh_db");
	}

	public EntityManager getEntityManager() {
		return emf.createEntityManager();
	}

	public void insertar(TipoDocumento emp) throws Exception {
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
