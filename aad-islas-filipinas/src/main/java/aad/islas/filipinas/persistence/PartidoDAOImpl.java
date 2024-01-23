package aad.islas.filipinas.persistence;

import aad.islas.filipinas.entities.Partido;
import jakarta.persistence.EntityManager;


public class PartidoDAOImpl extends GenericDAOImpl<Partido>{

	public PartidoDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}
	
}
