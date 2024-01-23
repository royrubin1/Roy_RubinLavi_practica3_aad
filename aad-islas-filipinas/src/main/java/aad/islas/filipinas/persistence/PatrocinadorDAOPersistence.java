package aad.islas.filipinas.persistence;

import java.util.List;
import aad.islas.filipinas.dao.DAO;
import aad.islas.filipinas.entities.Patrocinador;
import jakarta.persistence.EntityManager;


public class PatrocinadorDAOPersistence implements DAO<Patrocinador> {

	EntityManager entityManager;

	public PatrocinadorDAOPersistence(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public void insert(Patrocinador obj) {

	}

	@Override
	public void insertAll(List<Patrocinador> patrocinadores) {
		entityManager.getTransaction().begin();
		for (Patrocinador patrocinador : patrocinadores) {
			entityManager.persist(patrocinador);
		}
		entityManager.getTransaction().commit();

	}

	@Override
	public Patrocinador find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Patrocinador> getAll() {
		List<Patrocinador> patrocinadores = entityManager
				.createQuery("SELECT p FROM Patrocinador p", Patrocinador.class).getResultList();
		return patrocinadores;
	}

	@Override
	public void update(Patrocinador obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Patrocinador obj) {
		// TODO Auto-generated method stub

	}

}
