package aad.islas.filipinas.persistence;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import aad.islas.filipinas.dao.DAO;
import aad.islas.filipinas.entities.Jugador;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JugadorDAOPersistence implements DAO<Jugador> {
	EntityManager entityManager;
	public JugadorDAOPersistence(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public void insert(Jugador obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertAll(List<Jugador> objs) {
		entityManager.getTransaction().begin();
		try {
			for (Jugador jugador : objs) {
				entityManager.persist(jugador);
			}
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			e.printStackTrace();
		}
	}

	@Override
	public Jugador find(int id) {
		entityManager.getTransaction().begin();
		Jugador jugador = entityManager.createQuery("SELECT j FROM Jugador j WHERE id = :idJugador", Jugador.class)
				.getSingleResult();
		return jugador;
	}

	@Override
	public ArrayList<Jugador> getAll() {
		return null;
	}

	@Override
	public void update(Jugador jugador) {
		entityManager.getTransaction().begin();
		entityManager.merge(jugador);
		entityManager.getTransaction().commit();
	}

	@Override
	public void delete(Jugador obj) {
		// TODO Auto-generated method stub

	}

}
