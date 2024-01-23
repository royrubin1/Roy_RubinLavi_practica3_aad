package aad.islas.filipinas.persistence;

import java.util.ArrayList;
import java.util.List;

import aad.islas.filipinas.dao.DAO;
import aad.islas.filipinas.entities.Transferencia;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class TransferenciaDAOPersistence implements DAO<Transferencia>{
	
	EntityManager entityManager;
	
	public TransferenciaDAOPersistence(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	public void insert(Transferencia transferencia) {
		entityManager.getTransaction().begin();
		entityManager.persist(transferencia);
		entityManager.getTransaction().commit();
	}

	@Override
	public void insertAll(List<Transferencia> objs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Transferencia find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Transferencia> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Transferencia obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Transferencia obj) {
		// TODO Auto-generated method stub
		
	}

}
