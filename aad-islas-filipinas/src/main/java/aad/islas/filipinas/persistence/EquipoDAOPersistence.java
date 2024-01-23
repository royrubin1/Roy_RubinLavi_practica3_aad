package aad.islas.filipinas.persistence;

import java.util.List;

import aad.islas.filipinas.dao.DAO;
import aad.islas.filipinas.entities.Equipo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EquipoDAOPersistence implements DAO<Equipo>{

	EntityManager entityManager;
	
	public EquipoDAOPersistence(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	public void insert(Equipo obj) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void insertAll(List<Equipo> equipos) {
		entityManager.getTransaction().begin();  // Start the transaction
	    for (Equipo equipo : equipos) {
	    	entityManager.persist(equipo);
	    }
	    entityManager.getTransaction().commit();  // Commit the transaction
	}
	
	@Override
	public Equipo find(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Equipo> getAll() {
	    List<Equipo> equipos;
	    try {
	        equipos = entityManager.createQuery("SELECT e FROM Equipo e", Equipo.class).getResultList();
	    } catch (Exception e) {
	        // Manejar la excepción adecuadamente (p.ej., loggear el error)
	        throw new RuntimeException("Error al obtener todos los equipos", e);
	    }
	    return equipos;
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
