package aad.islas.filipinas.persistence;

import java.util.ArrayList;

import aad.islas.filipinas.dao.DAO;
import aad.islas.filipinas.entities.Patrocinador;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class PatrocinadorDAOPersistence implements DAO<Patrocinador>{

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("orm_competicion_unit");
	EntityManager em = emf.createEntityManager();
	
	@Override
	public void insert(Patrocinador obj) {

	}

	@Override
	public void insertAll(ArrayList<Patrocinador> patrocinadores) {
		em.getTransaction().begin();
		for (Patrocinador patrocinador : patrocinadores) {
			em.persist(patrocinador);
		}
		em.getTransaction().commit();
		
	}

	@Override
	public Patrocinador find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Patrocinador> getAll() {
		// TODO Auto-generated method stub
		return null;
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
