package aad.islas.filipinas.persistence;

import java.util.ArrayList;
import java.util.List;

import aad.islas.filipinas.dao.DAO;
import aad.islas.filipinas.entities.Partido;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceException;

public class PartidoDAOPersistence implements DAO<Partido>{

	EntityManager entityManager;
	
	public PartidoDAOPersistence(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
    @Override
    public void insert(Partido partido) {
        try {
        	entityManager.getTransaction().begin();
        	entityManager.persist(partido);
        	entityManager.getTransaction().commit();
        } catch (PersistenceException e) {
        	entityManager.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    @Override
    public void insertAll(List<Partido> partidos) {
        try {
        	entityManager.getTransaction().begin();
            for (Partido partido : partidos) {
            	entityManager.persist(partido);
            }
            entityManager.getTransaction().commit();
        } catch (PersistenceException e) {
        	entityManager.getTransaction().rollback();
            e.printStackTrace();
        }
    }

	@Override
	public Partido find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Partido> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Partido obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Partido obj) {
		// TODO Auto-generated method stub
		
	}
	
}
