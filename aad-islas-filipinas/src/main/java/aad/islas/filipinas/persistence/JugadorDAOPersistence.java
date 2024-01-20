package aad.islas.filipinas.persistence;

import java.util.ArrayList;
import java.util.Set;

import aad.islas.filipinas.dao.DAO;
import aad.islas.filipinas.entities.Jugador;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JugadorDAOPersistence implements DAO<Jugador>{
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("orm_competicion_unit");
	EntityManager em = emf.createEntityManager();
	
	@Override
	public void insert(Jugador obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertAll(ArrayList<Jugador> objs) {
		em.getTransaction().begin();
		for (Jugador jugador : objs) {
			em.persist(jugador);
		}
		em.getTransaction().commit();
	}

	@Override
	public Jugador find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Jugador> getAll() {
		return null;
	}

	@Override
	public void update(Jugador obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Jugador obj) {
		// TODO Auto-generated method stub
		
	}
	

}
