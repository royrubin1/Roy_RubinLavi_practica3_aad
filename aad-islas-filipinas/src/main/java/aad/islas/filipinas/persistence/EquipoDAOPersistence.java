package aad.islas.filipinas.persistence;

import java.util.ArrayList;
import aad.islas.filipinas.dao.DAO;
import aad.islas.filipinas.entities.Equipo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EquipoDAOPersistence implements DAO<Equipo>{

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("orm_competicion_unit");
	EntityManager em = emf.createEntityManager();
	@Override
	public void insert(Equipo obj) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void insertAll(ArrayList<Equipo> equipos) {
	    em.getTransaction().begin();  // Start the transaction
	    for (Equipo equipo : equipos) {
	        em.persist(equipo);
	    }
	    em.getTransaction().commit();  // Commit the transaction
	}
	
	@Override
	public Equipo find(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayList<Equipo> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void update(Equipo equipo) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete(Equipo equipo) {
		// TODO Auto-generated method stub
		
	}

	

}
