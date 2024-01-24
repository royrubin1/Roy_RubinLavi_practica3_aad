package aad.islas.filipinas.persistence;

import aad.islas.filipinas.entities.Estadio;
import jakarta.persistence.EntityManager;

public class EstadioDAOImpl extends GenericDAOImpl<Estadio>{

	public EstadioDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}

}
