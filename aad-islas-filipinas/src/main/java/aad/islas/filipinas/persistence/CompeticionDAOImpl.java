package aad.islas.filipinas.persistence;

import aad.islas.filipinas.entities.Competicion;
import jakarta.persistence.EntityManager;

public class CompeticionDAOImpl extends GenericDAOImpl<Competicion>{

	public CompeticionDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}

}
