package aad.islas.filipinas.persistence;

import java.util.ArrayList;
import java.util.List;

import aad.islas.filipinas.dao.DAO;
import aad.islas.filipinas.entities.Temporada;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceException;

public class TemporadaDAOPersistence implements DAO<Temporada>{
	EntityManager entityManager;
	
	public TemporadaDAOPersistence(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
    @Override
    public void insert(Temporada temporada) {
        try {
        	entityManager.getTransaction().begin();
            entityManager.persist(temporada);
            entityManager.getTransaction().commit();
        } catch (PersistenceException e) {
        	entityManager.getTransaction().rollback();
            e.printStackTrace();
        }
    }

	@Override
	public void insertAll(List<Temporada> objs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Temporada find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Temporada> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Temporada obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Temporada obj) {
		// TODO Auto-generated method stub
		
	}
	
}
